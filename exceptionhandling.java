/* You will be given two integers  and  as input, you have to compute . If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.

Sample Input 0:
10
3
Sample Output 0:
3

Sample Input 1:
10
Hello
Sample Output 1:
java.util.InputMismatchException

Sample Input 2:
10
0
Sample Output 2:
java.lang.ArithmeticException: / by zero

Sample Input 3:
23.323
0
Sample Output 3:
java.util.InputMismatchException
*/


import java.io.*;
import java.util.*;

public class exceptionhandling{

public static boolean is32BitSignedInteger(int n) {
         return (n<2147483647) && (n>-2147483648);
}
    
public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        try{
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(m!=0 && is32BitSignedInteger(n) && is32BitSignedInteger(m))
                System.out.println(n/m);
            if(m==0)
                throw new ArithmeticException();
            }
            
            catch(ArithmeticException e){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
            catch(InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
            }
        
    }
}
