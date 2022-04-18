import java.util.*; //step 1 import the necessary packages
import java.sql.*;
public class update {
public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver"); //step 2 load and register the driver class

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SI","root","Vidya@2001");
        //establish connection

        Statement s=conn.createStatement(); //step 4 create the statement object

        Scanner sc=new Scanner(System.in);
        System.out.println("Updation Operation");

        System.out.println("Enter the id number");
        int i=sc.nextInt(); //get the id of the student to update the student data

        System.out.println("Enter the name");
        String name=sc.next(); //get the name to update

        System.out.println("Enter the marks");
        int m=sc.nextInt(); //get the marks to update

        String sql="UPDATE student SET s_name='"+name+"',mark='"+m+"' WHERE id='"+i+"'";
            
        int r=s.executeUpdate(sql); //r has the value of the no.of rows affected by the execution of the query

        if(r>=1){
            System.out.println("data updation was successful");
        }
        else{
            System.out.println("data updation failed");
        }
        ResultSet rs=s.executeQuery("select * from student");
        while(rs.next()){

            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }

        s.close(); //close the statement object
        conn.close(); //close the connection object
           
    }
}  

