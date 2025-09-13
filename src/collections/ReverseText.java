package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseText {
    public static String reverse(String s){
        Deque<Character> st= new ArrayDeque<>();
        for(char c:s.toCharArray()) st.push(c);
        StringBuilder sb=new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("ATEX IT"));
    }
}
