import java.net.*;

public class decodeurl{
    public static void main(String[] args){
    try{
        String object="https%3A%2F%2Fwww.google.com"; //store the encoded url in a string called object

        String myurl=URLDecoder.decode(object,"UTF-8"); // convert the encoded url to a decoded one using
                                                        // decode method of the URLDecoder class

        System.out.println(myurl);
    }
    catch(Exception e){

        System.out.println("Failed to decode the url");
    }



    }
}
//decoded url-->simple url
//encoded url-->complex with %,etc. url