import java.util.*;
import java.io.*;

public class armstrong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,result=0,m;
        while(temp!=0){
            m=temp%10;
            result+=m*m*m;
            temp=temp/10;
        }
        if(result==n)
        System.out.println(n+" is an armstrong number");
        else
        System.out.println(n+" is not an armstrong number");
    }
}