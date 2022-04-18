import java.util.*;
/*Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s .
The second line contains an integer denoting k.
sample input:
welcometojava
3
sample output:
ava
wel
String s="welcometojava" has the following lexicographically-ordered substrings of length k=3
We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/
public class substrcomp {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String[] ch=new String[s.length()-k+1];
        for(int i=0;i<s.length()-k+1;i++){
            ch[i]=s.substring(i,i+k);

            /* System.out.print(ch[i]);
            output:wel elc lco com ome met eto toj oja jav ava*/
        }
        int n=ch.length;
        for(int i = 0; i < n-1; ++i) {  
         for (int j = i + 1; j < n; ++j) {  
            if (ch[i].compareTo(ch[j]) > 0) {  
               String temp = ch[i];  
               ch[i] = ch[j];  
               ch[j] = temp;  
            }  
         }  
      }
        
        smallest=ch[0];
        largest=ch[n-1];
        
        
        return smallest + "\n" + largest;
    }

}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
