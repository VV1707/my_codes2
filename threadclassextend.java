import java.util.*;
class multithread extends Thread{
    public void run(){
        try{
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        }
        catch(Exception e){
            System.out.println("Exception is caught");
        }
    }
}

public class threadclassextend{
    public static void main(String[] args) {
        System.out.println("Enter the number of threads");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            multithread o=new multithread();
            o.start();
        }
        
    }
}