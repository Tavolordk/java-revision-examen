package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class BalancedBrackets {
    private  static final Map<Character,Character> PAIR= Map.of(')','(',']','[','}','{');
    public static boolean isValid(String s){
        Deque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(PAIR.containsValue(c))st.push(c);
            else if(PAIR.containsKey(c)){
                if(st.isEmpty() || st.pop() != PAIR.get(c)) return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[{}]"));
        System.out.println(isValid("([)]"));
    }
}
