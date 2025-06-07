public class Outer {
    private int x = 5;
    protected class Inner {
        public static int x = 10;
        public void go() {
            System.out.println(x);
        }
        public static int suma(int num, int num2){
            return num+num2;
        }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        int sumaTotal=Inner.suma(3,3);
        in.go();
        System.out.println(sumaTotal);
    }
}