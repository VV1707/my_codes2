import java.util.Scanner;

public class breakkey{
    //demo for break keyword
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for (int i=0;i<n;i++){
            if(i==m){
                break;
            }
            else{
                System.out.println(i+" ");
            }
        }
    }
}