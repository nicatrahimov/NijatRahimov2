package az.codersazerbaijan.prac30may;

import java.time.LocalDate;
import java.util.*;
public class Stack<T>{
    public List<T> elements;
    public T name;

    public Stack(T name) {
        this.elements = new ArrayList<>();
        this.name = name;
    }

    public  void push(){
        elements.add(name);
}
public T pop() {
    if (elements.size() > 0) {
        return elements.get(0);
    }else return null;
}

        public boolean isEmpty(){
return elements.isEmpty();
    }
}
