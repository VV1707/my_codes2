import java.io;
import java.io.File;
import java.io.IOException;

public class createfile{
    public static void main(String [] args){
        try{
            File object=new File("C:\\Users\\vidya\\OneDrive\\Desktop\\New Folder\\SI\\todo.txt");
            if(object.createNewFile())
            System.out.println("File is created successfully");
            else
            System.out.println("File is already created");
        }
        catch (IOException e){
            System.out.println("Unable to create file");
        }


    }
}