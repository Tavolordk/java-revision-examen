public enum Planet {
    MERCURIO(3.30,2.49),
    VENUS(4.86,6.051);
    private final double masa;
    private final double radio;

    Planet(double masa, double radio){
        this.masa=masa;
        this.radio=radio;
    }
    public double surfaceGravity(){
        double G=6.67;
        return G*masa/(radio*radio);
    }

    public static void main(String[] args) {
        for(Planet planet: Planet.values()){
            System.out.println("Gravedad de "+planet.toString()+": " + planet.surfaceGravity());
        }
    }
}
