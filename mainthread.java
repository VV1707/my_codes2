public class mainthread extends Thread{
    public static void main(String[] args){
        Thread newthread=Thread.currentThread();
        System.out .println(newthread.getPriority()); //main thread has default priority of 5

        newthread.setPriority(8); //set 8 as the priority of the main thread
        System.out.println(newthread.getPriority());

        System.out.println(newthread.getName());  //returns name of the current thread

        System.out.println(newthread.getId()); ////returns id of the current thread

        Thread childthread=new Thread(){
            public void run(){
                System.out.println("Child thread is accessed");
            }
        };
        childthread.start();
    }
}
