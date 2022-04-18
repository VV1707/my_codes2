import java.sql.*; //step 1 import java.sql package 
public class App {
    public static void main(String[] args) throws Exception {

        //Class.forName("com.mysql.jdbc.Driver"); //step 2 load and register the jdbc driver
        System.out.println("Driver is loaded and registered");

        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SI","root","Vidya@2001"); /*step 3
                                                                        establish the connection with the database*/
        System.out.println("Connection is established");

        Statement stmt=conn.createStatement(); //step 4 create an object of Statement
        System.out.println("Statement object is created");

        ResultSet result=stmt.executeQuery("select * from student"); //step 5 execute the queries
        System.out.println("Query is executed");

        while(result.next()){ /*shift the pointer to the next position and 
                                check if there exists another record in the relation*/

            System.out.println(result.getInt(1)+" "+result.getString(2)+" "+ result.getInt(3)); /*step 6 get 
            value on each column of the record that is currently read */ 
        }

        stmt.close(); //step 7  close the Statement object
        System.out.println("Statement object is closed");
        
        conn.close(); //step 8  close the Connection object
        System.out.println("Connection object is closed");
    }
}
