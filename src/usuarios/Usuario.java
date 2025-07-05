package usuarios;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) throws NombreInvalidoException, EdadInvalidaException{
        if(nombre==null || nombre.trim().isEmpty()){
            throw new NombreInvalidoException("El nombre del usuario no debe ser vacío");
        }

        if(edad<18){
            throw new EdadInvalidaException("El usuario debe ser mayor de edad");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
