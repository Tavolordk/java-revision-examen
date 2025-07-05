package generics;

public class Caja<T> {
    private T contenido;

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "contenido=" + contenido +
                '}';
    }

    public static void main(String[] args) {
        Caja<String> cajaDeTexto=new Caja<>();
        cajaDeTexto.setContenido("Caja de Metal");

        Caja<Integer> cajaDeEnteros=new Caja<>();
        cajaDeEnteros.setContenido(12);

        System.out.println(cajaDeTexto.toString() +" " + cajaDeEnteros.toString());
    }
}
