package collections;

import java.util.*;

public class Colecciones {
    /*ESTRUCTURAS DE DATOS*/
    public static void main(String[] args) {
        List<Integer> edades = new ArrayList<>();
        edades.add(5);
        edades.add(34);
        edades.add(18);
        edades.add(3);
        /*Las estructuras de datos las usamos para poder usar los stream (expresiones lambda o arrow functions)
        * Usando el patron de diseño de pipeline y esto tambien se conoce como programacion funcional*/
        edades.stream().filter(edad->edad>=18).forEach(System.out::println);

    }

    public static long contarCuantasVocalesTieneElArreglo(Character [] arreglo, char letra){
        return Arrays.stream(arreglo).filter(caracter->caracter==letra).count();
    }


}
