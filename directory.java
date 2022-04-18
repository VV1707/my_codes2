/*You are given a phone book that consists of people's names and their phone number. 
After that you will be given some person's name as query. 
For each query, print the phone number of that person.

Input Format
The first line will have an integer n denoting the number of entries in the phone book. 
Each entry consists of two lines: a name and the corresponding phone number.
After these, there will be some queries. Each query will contain a person's name. 
Read the queries until end-of-file.

Constraints:
A person's name consists of only lower-case English letters and it may be in the format 
'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 digits without any leading zeros

Output Format: 
For each case, print "Not found" if the person has no entry in the phone book. 
Otherwise, print the person's name and phone number. See sample output for the exact format.
To make the problem easier, we provided a portion of the code in the editor. 
You can either complete that code or write completely on your own.

Sample Input
3
uncle sam
99912222
tom
11122222
harry
12299933
3
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933
*/

import java.util.*;
import java.lang.*;
public class directory{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<String>names=new ArrayList<String>(n);
        List<Integer>phone=new ArrayList<Integer>(n);

        for(int i=0;i<n;i++){
            names.add(sc.next());
            phone.add(sc.nextInt());
            sc.nextLine();
        }
        int query=sc.nextInt();
        for(int i=0;i<query;i++){
            String s=sc.next();
            boolean flag=names.contains(s);
            if(flag){
                int m=names.indexOf(s);
                System.out.println(s+"="+phone.get(m));
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}