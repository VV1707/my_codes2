import java.io;
import java.io.File;
import java.io.IOException;

public class createfile{
    public static void main(String [] args){
        try{   //provide try block since file creation may be interrupted due to various io exceptions

            File object=new File("Hello.txt"); //create new object of class File

            if(object.createNewFile())
                System.out.println("File is created successfully");
            else
                System.out.println("File is already created");

        }
        catch (IOException e){  //catch block is used to handle io exception if in case it was thrown
            System.out.println("Unable to create file");
        }
    }
}