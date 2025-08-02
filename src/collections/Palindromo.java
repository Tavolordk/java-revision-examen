package collections;

public class Palindromo {
    /*De una cadena de texto yo analice caracter por caracter empezando de izquierda a derecha
    y luego de derecha a izquierda para comparar si son iguales y si son iguales quiere decir
    que son palindromos
    * */
    public static  boolean esPalindromo(String texto){
        texto=texto.replaceAll("\\s","").toLowerCase();
        int izquierda=0;
        int derecha=texto.length()-1;

        while(izquierda<derecha){
            if(texto.charAt(izquierda)!=texto.charAt(derecha)){
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void main(String[] args) {
        String texto="dábale arroz a la zorra el abad";
        if(texto.contains("á")){
            texto=texto.replace("á","a");
        }
        boolean resultado=esPalindromo(texto);
        System.out.println("El resultado es " + resultado);
    }
}
