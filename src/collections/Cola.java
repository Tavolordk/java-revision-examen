package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    Queue<String> colaDeMensajeria=new LinkedList<>();

    public Queue<String> getColaDeMensajeria() {
        return colaDeMensajeria;
    }

    public static void main(String[] args) {
        Cola cola1=new Cola();
        cola1.colaDeMensajeria.offer("Hola como estas");
        cola1.colaDeMensajeria.offer("???");
        cola1.colaDeMensajeria.offer("holaaa!!");
        cola1.colaDeMensajeria.poll();
        System.out.println(cola1.getColaDeMensajeria());
    }
}
