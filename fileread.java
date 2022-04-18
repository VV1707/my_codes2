import java.io.*;
import java.util.*;
public class fileread{
    public static void main(String[] args){
        try{
        FileReader object=new FileReader("Hello.txt"); //create an object of filereader class
        int i; //begin to read the file
        if((i=object.read())!=-1){
                System.out.print((char)i);
            }
        }
    catch(IOException e){
        System.out.println("Exception is generated");
    }
    }
}