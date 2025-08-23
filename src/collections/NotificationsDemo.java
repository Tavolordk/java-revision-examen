package collections;


import java.util.concurrent.*;

class Notification{
    final String userId,channel,message;
    Notification(String userId, String channel, String message){
        this.userId=userId;
        this.channel=channel;
        this.message=message;
    }
}
public class NotificationsDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Notification> queue = new LinkedBlockingQueue<>();
        ExecutorService workers= Executors.newFixedThreadPool(3);
        Runnable worker = ()->{
            while (!Thread.currentThread().isInterrupted()){
                try{
                    Notification n = queue.take();
                    Thread.sleep(100);
                    System.out.println("Enviando a " + n.userId + " por " +n.channel+": " + n.message);
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        };
        for(int i=0;i<3;i++) workers.submit(worker);
        for(int i=1;i<=10;i++){
            queue.put(new Notification("user-"+i,i%2==0?"email":"sms","Bienvenido #"+i));
        }
        Thread.sleep(3000);
        workers.shutdownNow();
        workers.awaitTermination(1, TimeUnit.SECONDS);
    }
}

