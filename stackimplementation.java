import java.util.*;

public class stackimplementation{
    public static void main(String[] args){
        Stack s=new Stack();
        //push elements into the stack
        s.push(13);
        s.push(17);
        s.push(21);
        System.out.println(s);

        System.out.println(s.capacity());

        //pop element from stack
        s.pop();
        System.out.println(s);

        //printing top element from stack
        System.out.println(s.peek());

        //before removing all elements
        if(s.isEmpty())
        System.out.println("True");
        else
        System.out.println("False");

        s.pop();
        s.pop();
        if(s.isEmpty())
        System.out.println("True");
        else
        System.out.println("False");

    }
}