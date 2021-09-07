import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Student {
	 private double id;
	 private String name;
	 private int age;
	 private String grade;

	Student() {
	}

	void  SetId(double id) {
		this.id = id;
	}

	double GetId() {
		return id;
	}

	void SetName(String name) {
		this.name = name;
	}

	String GetName() {
		return name;
	}

	void SetAge(int age) {
		this.age = age;
	}

	int GetAge() {
		return age;
	}

	void SetGread(String grade) {
		this.grade = grade;
	}

	String GetGrade() {
		return grade;
	}
	PreparedStatement ps = null;
	Connection con = null;
	
	void input_drive() {
		try {
			//System.out.print(GetName());
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
			ps = con.prepareStatement("insert into cource (id,name,age,grade) values (?,?,?,?);");
			ps.setDouble(1, GetId());
			ps.setString(2, GetName());
			ps.setInt(3, GetAge());
			ps.setString(4, GetGrade());
			ps.executeUpdate();  
			//System.out.println(i+" records inserted");  
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
				System.out.printf("%15.1f",rs.getDouble(1));
				System.out.printf("%6s",rs.getString(2));
				System.out.printf("%5d\t",rs.getInt(3));
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
			
			ps.setString(1, GetName());
			ps.setInt(2, GetAge());
			ps.setString(3,GetGrade());
			ps.setDouble(4, GetId());
			ps.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
}
