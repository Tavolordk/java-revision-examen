public class Persona
{
    private int edad;
    private String nombre;
    private String apellido;
    Persona(){};
    Persona(int edad, String nombre, String apellido){
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Persona: { edad: " + this.edad + " nombre: " + this.nombre + " apellido: " + this.apellido+ " }";
    }

    public String dameLaEdadConDistintoFormato(int edad){
        return "La edad es " + edad;
    }

    public String dameLaEdadConDistintoFormato(double edad){
        return "La edad es " + edad;
    }

    public String dameLaEdadConDistintoFormato(String edad){
        return "La edad es " + edad;
    }

    public String dameLaEdadConDistintoFormato(String edadTexto,int edadEntera, double edadDecimal){
        return "La edad entera es: " + edadEntera + "La edad decimal es: " + edadDecimal + "La edad en texto es: " + edadTexto;
    }

     public int getEdad(){
        return this.edad;
     }

     public void setEdad(int edad){
        this.edad=edad;
     }
}
class Estudiante extends Persona{
    private long matricula;
    private String carrera;
    Estudiante(int edad, String nombre, String apellido, long matricula, String carrera){
        super(edad, nombre, apellido);
        this.matricula=matricula;
        this.carrera=carrera;
    }

    @Override
    public String toString(){
        return super.toString()+ " Estudiante: { Matricula: " + this.matricula + " Carrera: " + this.carrera + " }";
    }

    public static void main(String [] args){
        Persona estudiante = new Estudiante(23, "Alberto","Gomez",122334,"Biología");
        System.out.println(estudiante.dameLaEdadConDistintoFormato("23",23,23.5));
    }
}