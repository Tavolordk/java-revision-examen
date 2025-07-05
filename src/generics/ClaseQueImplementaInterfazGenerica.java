package generics;

public class ClaseQueImplementaInterfazGenerica implements InterfazGenerica<String>{

    @Override
    public void procesar(String input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        new ClaseQueImplementaInterfazGenerica().procesar("Hola");
    }
}

