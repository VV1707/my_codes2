import java.util.*;
import java.sql.*;
public class read {
public static void main(String[] args) throws Exception{
    //Class.forName("com.mysql.jdbc.Driver");

    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SI","root","Vidya@2001");

    Statement s=conn.createStatement();
    
    Scanner sc = new Scanner(System.in); 

    System.out.println("Display operation");

    System.out.println("Enter the ID number to display");
    int idNo=sc.nextInt();

    String sql="select * from student where id= '"+ idNo +"'";
    ResultSet rs=s.executeQuery(sql);
    rs.next();
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));

    s.close();
    conn.close();
    }
    
}
