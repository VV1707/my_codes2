public class except{
    public static void main(String args[]){
        //Arithmetic exception demo
        int a=5;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero exception is generated");
        }
        //Null pointer exception demo
        String s=null;
        try{
            int i=s.length();
            System.out.println(i);
        }
        catch(NullPointerException e){
            System.out.println("Null value exception");
        }
        finally{
            System.out.println("Finally block is executed");
        }
    }
}