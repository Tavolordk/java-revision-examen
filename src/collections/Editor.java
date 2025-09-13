package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Editor {
    private final Deque<String> undo = new ArrayDeque<>();
    private final Deque<String> redo= new ArrayDeque<>();
    private String text="";
    public void type(String s){
        undo.push(text);
        text+=s;
        redo.clear();
    }
    public void undo(){
        if(!undo.isEmpty()){
            redo.push(text);
            text=undo.pop();
        }
    }
    public void redo(){
        if(!redo.isEmpty()){
            undo.push(text);
            text=redo.pop();
        }
    }
    public String getText(){
        return text;
    }

    public static void main(String[] args) {
        Editor e = new Editor();
        e.type("Hola");
        e.type("Te extraño");
        e.undo();
        System.out.println(e.getText());
        e.redo();
        System.out.println(e.getText());
    }
}
