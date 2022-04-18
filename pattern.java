/*  TASK: Print the output for anyword using the below format
   
    Input : HELLO
    Output :*H*
            **E**
            ***L***
            ****L****
            *****O****    
*/
import java.util.*;
import java.lang.*;
public class welcome{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.print(s.charAt(i));
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println("\n");



        }

    }
}