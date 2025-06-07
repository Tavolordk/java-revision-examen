public enum Operation {
    ADD{
        public double apply(double x, double y){return x+y;}
    },
    SUBSTRACT{
        public double apply(double x, double y){return x-y;}
    };
    public abstract double apply(double x, double y);

    public static void main(String[] args) {
        System.out.println(ADD.apply(4,5));
    }
}
