package excepciones;

import java.io.FileNotFoundException;

public class ManejoDeExcepciones {
int num1;
int num2;
static boolean continuarFlujoDeprograma=true;

    public ManejoDeExcepciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int division(){
        return num1/num2;
    }

    public static void main(String[] args) {
          ManejoDeExcepciones manejoDeExcepciones=new ManejoDeExcepciones(1,0);
                manejoDeExcepciones.division();
    }
}
