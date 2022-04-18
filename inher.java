/*
 Using inheritance obtain the following output
I am walking //parent method
I am flying //child method
I am singing // child method
*/

import java.io.*;
import java.util.*;


class Animal{
	void walk()
	{
		System.out.println("I am walking");
	}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
    void sing(){
        System.out.println("I am singing");
    }
}

public class inher{

   public static void main(String args[]){

	  Bird bird = new Bird();
	  bird.walk();
	  bird.fly();
      bird.sing();
	
   }
}