public class str
{
    
public static void main(String args[]){    
    
char array[]={'h','e','l','l','o'};    
String s=new String(array); //converts the array of characters into a single string
System.out.println(s);

String s1="WOrld";
System.out.println(s1.charAt(3)); //returns character at the particular index

System.out.println(s1.toLowerCase()); //converts all chars to lower case

System.out.println(s1.toUpperCase()); //converts all chars to upper case

System.out.println(s1.length()); //returns length of the string

String y="IT ";
System.out.println(y.concat(s1)); // concates the second string to the first one.

String s2=" hello world ";
System.out.println(s2.contains(s1)); //checks if s2 contains s1 in it

System.out.println(s2.compareToIgnoreCase(s1)); // compares s1 and s2 and returns 0 if not equal

System.out.println(s2.replace('l','c')); //used to replace the all the occurences of the first character with the second character

System.out.println(s2.trim()); //remove the trailing and the leading space.

System.out.println(s2.endsWith("w")); //returns true if the string ends with the given char or the substring

String c="Abc";
byte[] b=c.getBytes(); //returns ascii value of the string chars in a byte array
for(int i=0;i<b.length;i++){
    System.out.println(b[i]);
}
String s3="hello#world%welcome";
String[] as=s3.split('#');
for (String x:as){
    System.out.println(x);
}


}

}  