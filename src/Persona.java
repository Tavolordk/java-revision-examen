public class Persona
{
    int edad;
    String nombre;
    String apellido;
    Persona(){};
    Persona(int edad, String nombre, String apellido){
        this.edad=edad;
        this.nombre=nombre;
        this.apellido=apellido;
    }

    @Override
    public String toString(){
        return "Persona: { edad: " + this.edad + " nombre: " + this.nombre + " apellido: " + this.apellido+ " }";
    }


}
class Estudiante extends Persona{
    long matricula;
    String carrera;
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
        System.out.println(estudiante.toString());
    }
}