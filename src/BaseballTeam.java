import java.util.Objects;

public class BaseballTeam {
    private String city, mascot;
    private int numberOfPlayers;

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        BaseballTeam that = (BaseballTeam) object;
        return numberOfPlayers == that.numberOfPlayers && Objects.equals(city, that.city) && Objects.equals(mascot, that.mascot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, mascot, numberOfPlayers);
    }
    // Imagina que aquí hay getters y setters

    public static void main(String[] args) {
        String a = "FB";
        String b = "Ea";
        System.out.println(a.hashCode()); // 2236
        System.out.println(b.hashCode()); // 2236
        System.out.println(a.equals(b)); // fals
    }
}