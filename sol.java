/*Given a list, L, of N integers, perform  Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,Q  (the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

Sample Input
5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output
0 1 78 12 23 */

import java.io.*;
import java.util.*;

public class sol{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        List<Integer>arr=new ArrayList<Integer>(N);
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String type=sc.next();
            switch(type){
            case "Insert":
                int index=sc.nextInt();
                int e=sc.nextInt();
                arr.add(index,e);
                break;
            case "Delete":
                int d=sc.nextInt();
                arr.remove(d);
            }
        }
        for(int c:arr){
            System.out.print(c+" ");
        }
    }
}