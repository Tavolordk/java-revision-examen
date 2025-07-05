package usuarios;

public class Main {
    public static void main(String[] args) {
        try {
            Usuario usuario1 = new Usuario("Juan",20);
            System.out.println("Usuario creado: " + usuario1.getNombre());

            Usuario usuario2=new Usuario("Oscar",18);
        } catch (EdadInvalidaException | NombreInvalidoException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
