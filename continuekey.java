import java.util.Scanner;

public class continuekey{
    //demo for continue keyword
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i=0;i<n;i++){
            if(i==m){
                continue;
            }
            else{
                System.out.println(i+" ");
            }
        }
    }
}