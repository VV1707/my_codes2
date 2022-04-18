import java.sql.*; //step 1 import the packages

public class updation {

    public static void main(String[] args) throws Exception {
        
        //Class.forName("com.mysql.jdbc.Driver") //step 2 load and register Driver class

        String url="jdbc:mysql://localhost:3306/SI";
        Connection conn=DriverManager.getConnection(url,"root","Vidya@2001"); // step 3 establish connection

        Statement s=conn.createStatement(); //create statement object

        String sql="update student set s_name='sh',mark=100 where id=2";
        int c=s.executeUpdate(sql); //execute the query, c has the value of the number of rows affected

        if(c>=1){
            System.out.println("Updated Successfully");
        }
        else{
            System.out.println("Updation failed");
        }

        ResultSet rs=s.executeQuery("select * from student");
        while(rs.next()){
            
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }

        s.close(); //close statement object

        conn.close(); //close connection object
    }
}
