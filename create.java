import java.sql.*;
import java.util.*;
import java.sql.Connection;
import java.sql.Statement;

public class create {
 public static void main(String[] args) {

        try(Scanner sc=new Scanner(System.in)){ //create object of the scanner class
        System.out.println("Insertion operation");

        System.out.println("Enter the name"); //get the student name as input from the user
        String name=sc.next();

        System.out.println("Enter the mark"); //get the student mark as input from the user
        int mark=sc.nextInt();

        insertStudent(name,mark); //call the method insertStudent to insert student data into the table
        }
    }

    static void insertStudent(String name,int mark){ //
        try{

            Class.forName("com.mysql.cj.jdbc.Driver"); //load and register the driver
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SI","root","Vidya@2001");
            //establish connection
            Statement s=conn.createStatement();//create object of statement

            boolean i=s.execute("insert into student(s_name,mark)\r\n"+"values('"+name+"', '"+mark+"')");
            //no result set generated..so 'i' is returned as false
            if(i){
                System.out.println("data insertion failed"); //not printed if insertion worked
            }
            else{
                System.out.println("data inserted successfully"); //printed if insertion worked
            }
            System.out.println(i);
            conn.close(); //close the connection object
        }
        catch(Exception e){
            
            System.out.println("Exception generated"); //exception if generated is handled
        }
    }
}
