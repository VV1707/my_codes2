import java.sql.*;

public class display {
public static void main(String[] args) throws Exception {

    System.out.println("Display operation");

    //Class.forName("com.mysql.jdbc.Driver");

    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SI","root","Vidya@2001");

    Statement s=conn.createStatement();

    String sql="select * from student where id=1";
    
    ResultSet rs=s.executeQuery(sql);
    rs.next();
    System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
    
    s.close();
    conn.close();
    }      
}
