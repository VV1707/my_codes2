import java.util.*;

import javax.lang.model.util.ElementScanner14; 
public class palindrome{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    int i=0,j=s1.length()-1;
    boolean flag=true;
    while(i<j){
      if(s1.charAt(i)==s1.charAt(j))
        flag=true;
      else{
        flag=false;
	  break;
	}
      i++;
      j--;
    }
    if(flag==false)
    System.out.println("Not Palindrome");
    else
    System.out.println("Palindrome");

  }
}