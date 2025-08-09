package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class Cola2 {
    /*Cola de clientes de un banco*/
    public static void main(String[] args) {
        Queue<String> colaDeClientes= new ArrayDeque<>();
        colaDeClientes.offer("Cliente Pedro - Retiro");
        colaDeClientes.offer("Cliente Manuel - Deposito");
        colaDeClientes.offer("Cliente Alejandro - Apertura de cuenta");

        while (!colaDeClientes.isEmpty()){
            String cliente = colaDeClientes.poll();
            System.out.println("Atendiendo a: " + cliente);
        }
        System.out.println("Ya fueron todos los clientes en atender");
    }
}
