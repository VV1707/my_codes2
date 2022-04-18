import java.sql.*;//step 1 import package java.sql

public class add {
 public static void main(String[] args) throws Exception {

    //Class.forName("com.mysql.jdbc.Driver"); //step 2 load and register the driver

    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SI","root","Vidya@2001");//establish connection

    Statement s=conn.createStatement();//create object of statement

    int i=s.executeUpdate("insert into student values(6,'ss',100)");

    System.out.println(i);

    s.close();
    conn.close();
}
}

