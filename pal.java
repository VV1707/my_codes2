import java.io.*;
import java.util.*;

public class pal {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int flag=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==A.charAt(A.length()-i-1)){
                flag=1;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==1)
        System.out.println("Yes");
        else
        System.out.println("No");
    }   
}


