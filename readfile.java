import java.io.*;
import java.util.*;

public class readfile{
    public static void main(String[] args){
        try{

            File object=new File("Hello.txt"); //create file object of file class
            Scanner sc=new Scanner(object);

            while(sc.hasNextLine()){ //if there are lines left to read then 
                String data=sc.nextLine();  //store each line in the data string
                System.out.print(data);   //print the string then and there
            }

            sc.close(); //close read operation

        }
        catch(IOException e){  //catch block is used to handle io exception if in case it was thrown
            System.out.println("Read operation not successfull");
        }

    }
}