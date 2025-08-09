package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapa2 {
    public static void main(String[] args) {
        record Persona(String nombre, String ciudad){
        }
        List<Persona> personas = List.of(
                new Persona("Ana","CDMX"),
                new Persona("Luis","GDL"),
                new Persona("Pedro","CDMX")
        );
        Map<String,List<Persona>> porCiudad=new HashMap<>();
        for (Persona p:personas){
porCiudad.computeIfAbsent(p.ciudad(),k->new ArrayList<>()).add(p);
        }
        System.out.println(porCiudad);
    }
}
