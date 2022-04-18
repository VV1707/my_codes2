import java.io;
import java.io.File;
import java.io.IOException;

public class deletefile{
    public static void main(String [] args){
        // create a new file called todo.txt
        try{   //provide try block since file creation may be interrupted due to various io exceptions

            File object=new File("todo.txt"); //create new object of class File

            if(object.createNewFile())
                System.out.println("File is created successfully");
            else
                System.out.println("File is already created");

        }
        catch (IOException e){  //catch block is used to handle io exception if in case it was thrown
            System.out.println("Unable to create file");
        }

        //delete the file todo.txt
        File obj=new File("todo.txt"); //create new object of class File

        if(obj.delete())
            System.out.println("File is deleted successfully");
        else
            System.out.println("Not deleted");

    }
}