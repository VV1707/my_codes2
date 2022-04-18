import java.net.*;

public class createurl{
    public static void main(String[] args){

    //create url by directly specifying the complete url
    try{
        URL myurl=new URL("https://www.google.com"); //create new url using the URL class
        System.out.println(myurl.toString());

        System.out.println("first url is created successfully");
    }
    catch(MalformedURLException e){
        System.out.println("create a valid url");
    }
    //create url by specifying the parts
    try{
        String protocol="https"; //set the protocol name
        String host="www.google.com"; //set the website url
        int port=1707; //set the port
        String file="/images"; //set the path

        URL myurl2=new URL(protocol, host, port, file); //pass all the above details as parameters for the URL generation
        System.out.println(myurl2.toString());

        System.out.println("second url is created successfully");
    }
    catch(MalformedURLException e){

        System.out.println("create a valid url");
    }
    
    }
}