import java.io.*;
import java.net.*;
public class server{
public static void main(String[] args){
try{
    ServerSocket ss=new ServerSocket(40); //create a server socket with the port number

    Socket s=ss.accept(); //establish a conn and wait for any frequests

    DataInputStream d=new DataInputStream(s.getInputStream()); //obtain the input from the client 
    
    String str=(String)d.readUTF(); //read the input as a string and store it in a string variable and print it.
    System.out.println(str);
    
    ss.close(); //close the server socket
}
catch(Exception e){
    System.out.println("Exception generated");
}
}
}