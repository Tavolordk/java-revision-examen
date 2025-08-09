package collections;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Mapa {
    public static void main(String[] args) {
        String cadeDeTexto= "hola mundo hola java";
        Map<String,Integer> mapa = new HashMap<>();
        for(String palabra:cadeDeTexto.split(" ")){
            mapa.merge(palabra,1,Integer::sum);
        }
        System.out.println(mapa);
    }
}
