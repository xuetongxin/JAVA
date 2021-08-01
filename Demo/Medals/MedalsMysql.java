package Medals;

import java.sql.*;

class MedalsMysql {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("select * from medalsmysql");

			while (rs.next()) {
				System.out.printf("%3s",rs.getString(1));
				System.out.printf("%5d",rs.getInt(2));
				System.out.printf("%5d",rs.getInt(3));
				System.out.printf("%5d",rs.getInt(4));
				System.out.printf("%5d\n",rs.getInt(5));
			}
			con.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}