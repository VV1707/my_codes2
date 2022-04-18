/*We use the integers a,b and n to create the following series:
(a+2^0*b),(a+2^0*b+2^1*b),(a+2^0*b+2^1*b+2^3*b),...,(a+2^n-1*b)

Input Format : Three space-separated integers describing the respective , , and  values for that query.
Output Format : print the corresponding series in order as a single line of  space-separated integers.

Sample Input : 5 3 5
Sample Output : 8 14 26 50 98*/
import java.util.*;
import java.lang.Math.*;

public class loop{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter value for a");
        int a=s.nextInt();

        System.out.println("Enter value for b");
        int b=s.nextInt();

        System.out.println("Enter value for n");
        int n=s.nextInt();

        for(int i=1;i<=n;i++){
            int sum=a;
            for(int j=0;j<i;j++){
                sum+=Math.pow(2,j)*b;
            }
            System.out.print(sum+" ");
        }
        
    }
}