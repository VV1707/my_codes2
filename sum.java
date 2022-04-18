import java.util.*; 
public class sum{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int s=0;
    while(n!=0){
      s+=n%10;
      n=n/10;
    }
    System.out.println(s);
  }
}