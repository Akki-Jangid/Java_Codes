import java.sql.*;

class Demo {
  public static void main (String[] args) throws SQLException {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
      if (con != null) {
       System.out.println("Connection Successfully");
       } else {
          System.out.println("Failed in Connection");
           }
      Statement st = con.createStatement(); 
      ResultSet rs = st.executeQuery("Select * from aakash");
      while (rs.next()) {
        System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"     "+rs.getString(3)+"       "+rs.getString(4));
         }
      con.close();
      } catch (Exception ex) {
         System.out.println("Error While Connection in JDBC to SQL "+ex);
         }
   }
}