import java.util.*;
public class word{
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        String[] r=str.split("\\s+");
        for(String x:r){
            count+=1;
        }
        System.out.println(count);

    }
}
