package Teacher_Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class a {

	public static void main(String[] args) throws SQLException {
		Statement stmt1 = null;
		Statement stmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
			stmt1 = con.createStatement();
			stmt2 = con.createStatement();
			rs1 = stmt1.executeQuery("select account from passwd_date");
			rs2 = stmt2.executeQuery("select passwd from passwd_date");
			rs2.last();
			
		} catch (Exception ex) {
			ex.getStackTrace();
		} finally {
			
			while (rs1.next()) {
				
				if (rs1.getString(1).matches("2034576972")) {
					System.out.print(true);
					
					while(rs2.next()) {
						if(rs2.getString(1).matches("xsl203457")) {
							System.out.print(false);
						}
					}

				}
			}
			
			
		}
	}
}