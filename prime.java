import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int flag=0;
        for(int i=n;i<m+1;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
                else
                flag=0;
            }
            if(flag==0)
                System.out.println(j);
        } 
    }
}