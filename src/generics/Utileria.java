package generics;

import java.util.ArrayList;
import java.util.List;

public class Utileria {
    public static <T> void imprimir(T elemento){
        System.out.println(elemento);
    }

    public static <T extends Number> double suma(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    public static void agregarListado(List<? super Integer > listado){
        listado.add(112323332);
    }

    public static void imprimirLista(List<?> lista){
        for(Object obj:lista){
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Utileria.imprimir(12);
        Utileria.imprimir("HOLA");
        Utileria.imprimir('A');
        Utileria.imprimir(123.908);
        Utileria.imprimir(null);

        System.out.println(Utileria.suma(12.5446,13));
        List<Integer> listaDeEnteros=new ArrayList<>();
        listaDeEnteros.add(2);

        List<Double> listaDeDecimales=new ArrayList<>();
        listaDeDecimales.add(123.4);
        Utileria.imprimirLista(listaDeEnteros);
        Utileria.imprimirLista(listaDeDecimales);
    }
}
