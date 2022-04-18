import java.net.*; //imports all the classes required for java networking

public class gethostaddress{
    public static void main(String [] args){
    try{
        InetAddress host= InetAddress.getLocalHost(); //set the local host as host using inetaddress class

        System.out.println(host.getHostAddress()); //returns the host address alone
    }
    catch(Exception e)
    {
        System.out.println("failure in obtaining host"); //printed if any kind of exception arises
    }
    }
}