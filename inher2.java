/* The main method should print the following:
    My superclass is: Arithmetic
    42 13 20

    A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
    A class named Adder that inherits from a superclass named Arithmetic.Your classes should not be be public.abstract*/

import java.io.*;
import java.util.*;

//parent class
class Arithmetic{
    public int add(int a,int b){
        return a+b;
    }
}

//child class
class Adder extends Arithmetic{
    //inherits the method add from its super class called arithmetic
}

public class inher2{
    public static void main(String []args){
        //create adder class object
        Adder a = new Adder();
        System.out.println("Subclass is : "+a.getClass().getName());  //print sub class name
        System.out.println("Superclass is : "+a.getClass().getSuperclass().getName());	 //print super class name
        System.out.print(a.add(10,32) + "  " + a.add(10,3) + "  " + a.add(10,10) + "\n");
     }
}