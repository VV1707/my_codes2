public class userdefinedex{
    public static void main(String[] args){
        try{
            throw new MyException("Hello");
        }
        catch(Exception e){
            System.out.println("Exception thrown explicitly");
        }

    }
}
class MyException extends Exception{
    int a;
    MyException(String s){
        super(s);
    };
}