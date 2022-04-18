public class singleDeadlock{
    public static void main(String[] args){
        try{
            System.out.println("Enter into deadlock"); //begin deadlock

            Thread.currentThread().join(); //makes current thread wait until another completes its execution

            System.out.println("entered deadlock"); //this won't be executed due to deadlock
        }
        catch(InterruptedException e){

            System.out.println("Exception generated");
        }
    }
}