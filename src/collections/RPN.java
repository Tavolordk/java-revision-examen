package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class RPN {
public static int eval(String expr){
    Deque<Integer> st= new ArrayDeque<>();
    for(String tok:expr.split("\\s+")){
        switch (tok){
            case "+":st.push(st.pop() + st.pop());break;
            case"-":{int b=st.pop(), a=st.pop(); st.push(a-b);}break;
            case"*":st.push(st.pop()*st.pop());break;
            case"/":{int b=st.pop(),a=st.pop();st.push(a/b);}break;
            default:st.push(Integer.parseInt(tok));
        }
        System.out.println(tok);
    }
    return st.pop();
}

    public static void main(String[] args) {
        System.out.println(eval("3 4 + 2 *"));
        System.out.println(eval("3 4 2"));

    }
}
