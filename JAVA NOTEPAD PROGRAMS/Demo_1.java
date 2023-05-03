// package Akki;
 
import java.sql.*;
 
public class Demo_1 {
   public static void main (String[] args) {
	   Connection con = null;
	   
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   con = DriverManager.getConnection("jdbc:mysql://localhost/","root","Student@123");
		   System.out.println("Connection Successful");
		   Statement stm = con.createStatement();
		   stm.executeUpdate("Create DATABASE  TESTSQL");
		   System.out.println("DATABASE Created Successfully");
	   } catch (Exception e) {
		   System.out.println("Connection Failed "+e);
	   }
   }
}
