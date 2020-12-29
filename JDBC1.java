
package jdbc1;
import java.sql.*;
public class JDBC1 {

    
    public static void main(String[] args) 
    {
       try
       {  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayank","root","root");  
    
     Statement stmt=con.createStatement();  
     String sql = "insert into employee values (3,'fharan','K'); ";
    int x= stmt.executeUpdate(sql);
     ResultSet rs = stmt.executeQuery("select * from employee"); 
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }
       catch(Exception e)
       { 
           System.out.println(e);
       }  
    }
    
}