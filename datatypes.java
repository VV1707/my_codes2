public class datatypes
{
public static void main(String args[])
{
int a=10;
float b=a; //explicit type conversion
System.out.println(a); //printing int value
System.out.println(b); //printing corresponding float value

double c=a; //widening casting
System.out.println(c);

double d=17.0;
int x=(int)d; //narrowing casting
System.out.println(d);//printing  double value
System.out.println(x);
}

}