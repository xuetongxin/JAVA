import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Drive {
	Drive(){}
	Student student=new Student();
	PreparedStatement ps = null;
	Connection con = null;
	
	void input_drive() {
		try {
			
			
			System.out.print(student.GetName());
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
			ps = con.prepareStatement("insert into cource (id,name,age,grade) values (?,?,?,?)");
			ps.setDouble(1, student.GetId());
			ps.setString(2, student.GetName());
			ps.setInt(3, student.GetAge());
			ps.setString(4, student.GetGrade());
			int i=ps.executeUpdate();
			System.out.println(i);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	void select_drive() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from cource");
			while (rs.next()) {
				System.out.print(rs.getDouble(1) + "   ");
				System.out.print(rs.getString(2) + "   ");
				System.out.print(rs.getInt(3) + "   ");
				System.out.println(rs.getString(4));
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	void update_drive() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
			ps = con.prepareStatement("update cource set name=?,age=?,grade=? where id=?");
			
			ps.setString(1, student.GetName());
			ps.setInt(2, student.GetAge());
			ps.setString(3, student.GetGrade());
			ps.setDouble(4, student.GetId());
			ps.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
