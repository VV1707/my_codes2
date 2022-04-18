//Program to count number of articles in a sentence

import java.io.*;
import java.util.*;
public class s1{
    public static void main(String [] args){
        String e="After a long day, a cup of tea tastes particularly good";
        String[] array=e.split("\\s+");
        int count=0;
        for(String s:array){
            switch(s){
                case "a":
                    count+=1;
                    break;
                case "an":
                    count+=1;
                    break;
                case "the":
                    count+=1;
                    break;
            }
        }
        System.out.println(count);
    }
}