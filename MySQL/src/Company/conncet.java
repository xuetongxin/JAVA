package Company;

import java.sql.*;
class conncet{
        public static void main(String[] args){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl","root","xsl203457");
        Statement stmt =con.createStatement();

        ResultSet rs=stmt.executeQuery("select * from employee");
        while(rs.next()){
                System.out.println(rs.getInt(1));
        }
        con.close();
        }
        catch(Exception ex){
                System.out.println(ex);
                }
        }
}