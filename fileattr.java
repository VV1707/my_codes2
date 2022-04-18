import java.util.*;
import java.io.*;

public class fileattr{
    public static void main(String [] args){
            File object =new File("Hello.txt"); //create new file object of the File class

            System.out.println(object.getName()); //returns name of the file

            System.out.println(object.getAbsolutePath()); //returns the path of the file

            System.out.println(object.exists()); //if file exists returns true else false

            System.out.println(object.canRead()); //if file is readable returns true else false

            System.out.println(object.canWrite()); //if file is writable returns true else false

            System.out.println(object.length()); //returns length of the file
    }
}