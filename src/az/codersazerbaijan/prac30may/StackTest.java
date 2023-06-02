package az.codersazerbaijan.prac30may;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StackTest {
    public static void main(String[] args) {
        Stack<String>stack1=new Stack<>("Jesse");
        Stack<String>stack2=new Stack<>("Lalo");
        Stack<String>stack3=new Stack<>("Hector");
        Stack<String>stack4=new Stack<>("Nicat");

        stack1.push();
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        stack2.push();

        System.out.println(stack2.elements.remove(0));
        System.out.println(stack2.elements);
        System.out.println(stack2.isEmpty());

    }
}
