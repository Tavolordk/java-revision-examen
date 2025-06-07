import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public enum Color {
    RED(new String[]{"FF000","AA4561"}),
    GREEN(new String[]{"345678","341209"}),
    BLUE(new String[]{"235443","456789"});
    private String [] shades;
    Color(String [] shades){
        this.shades=shades;
    }
    public String [] getShades(){
        return shades;
    }

    public static void main(String[] args) {
        for(Color color: Color.values()){
            Arrays
                    .asList(color.getShades())
                    .stream().
                    map(e->color.toString() +" "+ e).
                    collect(Collectors.toList()).
            forEach(System.out::println);
        }
    }
}
