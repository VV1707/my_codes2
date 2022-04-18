import java.net.*;
public class encodeurl{
    public static void main(String[] args){
        try{

        String object="https://www.google.com"; //store the decoded url in a string variable called as object

        String myurl= URLEncoder.encode(object, "UTF-8"); //convert the decoded string to an encoded url 
                                                          //using the method encode of the URLEncoder class

        System.out.println(myurl);
        }
        catch(Exception e){
            
            System.out.println("Failure in encoding");
        }
    }

}