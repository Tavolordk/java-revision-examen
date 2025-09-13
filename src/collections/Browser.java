package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Browser {
    private final Deque<String> back = new ArrayDeque<>();
    private final Deque<String> fwd=new ArrayDeque<>();
    private String current="about:blank";
    public void visit(String url){
        back.push(current);
        current=url;
        fwd.clear();
    }
    public String back(){
        if(back.isEmpty())return current;
        fwd.push(current);
        current=back.pop();
        return current;
    }

    public String forward(){
        if(fwd.isEmpty()) return current;
        back.push(current);
        current=fwd.pop();
        return current;
    }
    public String getCurrent(){
        return current;
    };

    public static void main(String[] args) {
        Browser b = new Browser();
        b.visit("google.com");
        b.visit("openai.com");
        b.back();
        System.out.println(b.getCurrent());
        b.forward();
        System.out.println(b.getCurrent());
    }
}
