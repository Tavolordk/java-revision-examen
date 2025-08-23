package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

class Order{
    final String id;
    int attemps=0;
    Order(String id){
        this.id=id;
    }
}
public class OrdersWithRetryDLQ {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Order> mainQ = new LinkedBlockingQueue<>();
        BlockingQueue<Order> dlq=new LinkedBlockingQueue<>();
        ExecutorService worker = Executors.newSingleThreadExecutor();
        Set<String> flaky= new HashSet<>(List.of("order-2","order-4","order-6"));

        worker.submit(()->{
           while(!Thread.currentThread().isInterrupted()){
               try{
                   Order o = mainQ.take();
                   try{
                       proccess(o,flaky);
                       System.out.println("OK -> " + o.id);
                   } catch (RuntimeException e) {
                       o.attemps++;
                       if(o.attemps>=3){
                           System.out.println("RETRY ("+o.attemps+") -> "+o.id +" cause=" + e.getMessage());
                       mainQ.put(o);
                       }else{
                           System.out.println("DLQ -> " + o.id + " cause="+e.getMessage());
                           dlq.put(o);
                       }
                   }
               }catch (InterruptedException e) {
                   Thread.currentThread().interrupt();
               }
           }
        });

        for(int i=1;i<=6;i++){
            mainQ.put(new Order("order-"+i));
        }
        Thread.sleep(5000);
        worker.shutdownNow();
        worker.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("----DLQ contents----");
        dlq.forEach(o-> System.out.println(o.id + " attemps="+o.attemps));
    }

    static void proccess(Order o, Set<String> flaky){
        try {
            Thread.sleep(120);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if(flaky.contains(o.id)&&o.attemps<2){
            throw new RuntimeException("Temporal Failure");
        }
    }
}
