import java.util.LinkedList;

public class linkedlist{
    public static void main(String[] args){
        LinkedList <String> array=new LinkedList<String>();

        array.add("abc"); //add elements to the linked list
        array.add("def");
        array.add("ghi");
        System.out.println(array);

        array.addFirst("first"); //add element before the initial container of the linked list
        System.out.println(array);

        array.addLast("last"); //add element as the last container of the linked list
        System.out.println(array);

        array.removeFirst();  //removes first element from the array
        System.out.println(array);

        array.removeLast(); //removes last element from the array
        System.out.println(array);

        System.out.println(array.getFirst()); //returns the element in the first container

        System.out.println(array.getLast()); //returns the element in the last container


    }
}