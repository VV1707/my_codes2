import java.util.*;
import java.io.*;

public class ht{
    public static void main(String[] args){
        HashMap<Integer, String> ht1 = new Hashtable<>();//instantiate the hashtable 
        HashMap<integer, String> ht2 = new Hashtable<>();//instantiate the hashtable 

        //add mappings to the first hash table
        ht1.put(1, "one");
        ht1.put(2, "two");
        //add mappings to the second hash table
        ht2.put(3, "three");
        ht2.put(4, "four");
        System.out.println(ht1);// Print mappings of first hashtable
        System.out.println(ht2);// Print mappings of second hashtable


    }

}