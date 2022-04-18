import java.io.*;
import java.net.*;
public class client{
public static void main(String[] args){
try{
    Socket s=new Socket("localhost",40);//create new client socket using the parameters name and port of the server

    DataOutputStream out=new DataOutputStream(s.getOutputStream()); //set the output stream

    out.writeUTF("hello");
    out.close(); //close writing operation
    
    s.close(); //close client socket
}
catch(Exception e){
    System.out.println("Exception generated");
}
}
}