import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class a {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps = null;
		Connection con=null;
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl","root","xsl203457");
        ps = con.prepareStatement("insert into cource (id,name,age,grade) values (?,?,?,?)"); 
        ps.setDouble(1, 222222);
        ps.setString(2, "kkk");
        ps.setInt(3, 12);
        ps.setString(4, "freashman");  
        }catch(Exception ex){
            System.out.println(ex);
            }
}
}
