import java.util.*;
import java.lang.*;

public class removechar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Get the string as input");
        String s=sc.nextLine();

        System.out.println("Get the character to remove as input");
        String b=sc.next();
        char c=b.charAt(0);

        //char[] ar=new char[s.length()];
        char [] ar=s.toCharArray();
        for(int i=0;i<s.length();i++){
            ar[i]=s.charAt(i);
            if(ar[i]!=c)
            System.out.print(ar[i]);

        }
    }
}

