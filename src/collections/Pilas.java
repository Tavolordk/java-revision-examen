package collections;

/*LIFO -> Last In First Out*/
public class Pilas {
    private final int capacidad;
    private final int[] datos;
    private int tope;

    public Pilas(int capacidad){
        if(capacidad<=0){
            throw new IllegalArgumentException("La capacidad debe ser mayor que 0");
        }
        this.capacidad=capacidad;
        this.datos=new int[capacidad];
        this.tope=-1;
    }

    public void push(int valor){
        if(tope==capacidad-1){
            throw new IllegalArgumentException("La pila está llena");
        }
        datos[++tope]=valor;
    }
    public int pop(){
        if(tope==-1){
            throw new IllegalArgumentException("La pila está vacía");
        }
        return datos[tope--];
    }

    public int peek(){
        if(tope==-1){
            throw new IllegalArgumentException("La pila está vacía");
        }
        return datos[tope];
    }

    public boolean isEmpty(){
        return tope==-1;
    }

    public int size(){
        return tope+1;
    }
    public void clear(){
        tope=-1;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<=tope;i++){
            sb.append(datos[i]);
            if(i<tope) sb.append(", ");
        }
        sb.append("] <-cima");
        return sb.toString();
    }

    public static void main(String[] args) {
        Pilas pila1 = new Pilas(5);
        String pilaEstaVacia=pila1.isEmpty()?"SI":"NO";
        System.out.println("Inicio: " + pila1 + " | vacía= " + pilaEstaVacia);
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);
        pila1.push(4);
        pila1.push(5);
        String pilaEstaVacia2=pila1.isEmpty()?"SI":"NO";
        pila1.pop();
        System.out.println("Inicio: " + pila1 + " | vacía= " + pilaEstaVacia2);
        System.out.println("Ultimo elemento insertado: " + pila1.peek());
        System.out.println(pila1.toString());
        System.out.println("Eliminando todos los elementos de la pila");
        pila1.clear();
        String pilaEstaVacia3=pila1.isEmpty()?"SI":"NO";
        System.out.println("Inicio: " + pila1 + " | vacía= " + pilaEstaVacia3);
    }
    /*
    * LOS USOS DE LAS PILAS:
    * DESHACER/REHACER EN EDITORES(CTRL+Z/CTRL+Y)
    * BOTON DE ATRAS Y TE DEVUELVE LA PAGINA ANTERIOR ESTAMOS USANDO UN POP EN NAVEGADORES
    * EVALUAR EXPRESIONES MATEMATICAS 3*(4+5) NUESTROS COMPILADORES MANEJAN PUES LOS OPERADORES Y PARENTESIS
    * POR EJEMPLO JAVA, C, PYTHON PUES ESAN ESTE MANEJO DE PILAS PARA ESTAS EXPRESIONES
    * */
}
