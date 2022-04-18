import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queueimplementation{
    public static void main(String[] args){
        Queue q=new PriorityQueue();//create queue using priority queue
        q.add(12);
        q.add(15);
        q.add(45);
        q.add(8);
        System.out.println(q);

        Queue r=new LinkedList();//create queue using linkedlist
        r.add(16);
        r.add(67);
        r.add(88);
        r.add(44);
        System.out.println(r);

        q.remove();
        System.out.println(q);

        System.out.println(q.peek());
        
        

    }
}