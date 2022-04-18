import java.io.*;

public class writefile{
    public static void main(String[] args){
        try{  //provide try block since file handling may involve various io exceptions

            FileWriter object=new FileWriter("Hello.txt"); //create new file object of FileWriter class

            String str="Hello world"; 

            object.write(str);//write the string into the file

            object.close(); //close write operation

            System.out.println("Written successfully");
        }
        catch (IOException e){  //catch block is used to handle io exception if in case it was thrown
            System.out.println("Unable to write to file");
        }
    }
}