import java.util.Calendar;
import java.util.GregorianCalendar;

public class cal{
    public static void main(String [] args){
        Calendar c=new GregorianCalendar();// w/o using getInstance .. direct creation of object of the Georgian Calendar class
        System.out.println(c.getTime());

        Calendar d=Calendar.getInstance();//using getInstance method which creates a singleton class with just one instance or an object
        System.out.println(d.getTime());
    }
}