import java.net.*;

public class getdetails{
    public static void main(String[] args){
        try{
        URL myurl=new URL("https://www.google.com:1707/images/alphabets"); //create new url instance.
        System.out.println(myurl.getProtocol()); //returns the protocol

        System.out.println(myurl.getHost()); //returns the host

        System.out.println(myurl.getPort()); //returns the port number

        System.out.println(myurl.getPath()); //returns the path
        }
        catch(MalformedURLException e){
            System.out.println("failed to obtain details");
        }

    }
}