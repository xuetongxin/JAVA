package Teacher_Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Register extends Application {
	Successful_SingUp Successful = new Successful_SingUp();
	GridPane gridpane = new GridPane();
	BorderPane borderpane = new BorderPane();

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根

		Scene scene = new Scene(borderpane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Sing Up");
		stage.show();

		Button register = new Button("Register");
		Button btreturn = new Button("Return");
		Label lb1 = new Label("AccountName:");
		Label lb2 = new Label("Passwd:");
		TextField txfd1 = new TextField();
		TextField txfd2 = new TextField();

		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.add(lb1, 0, 0);
		gridpane.add(txfd1, 1, 0);
		gridpane.add(lb2, 0, 1);
		gridpane.add(txfd2, 1, 1);
		gridpane.add(register, 1, 2);
		gridpane.setAlignment(Pos.CENTER);

		borderpane.setCenter(gridpane);
		borderpane.setBottom(btreturn);

		btreturn.setOnAction(e -> {
			Login login = new Login();
			try {
				login.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});

		register.setOnAction(e -> {

			Statement stmt1 = null;
			ResultSet rs1 = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
				stmt1 = con.createStatement();
				rs1 = stmt1.executeQuery("select account from passwd_date");

			} catch (Exception ex) {
				ex.getStackTrace();
			}

			try {
				while (rs1.next()) {

					if (rs1.getString(1).matches(txfd1.getText())) {
						System.out.println("用户名已存在");
						stage.showAndWait();
					} else {

						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root",
									"xsl203457");
							PreparedStatement ps = con
									.prepareStatement("insert into passwd_date (account,passwd) values (?,?)");
							ps.setString(1, txfd1.getText());
							ps.setString(2, txfd2.getText());
							ps.executeUpdate();
							Successful.start(stage);
							//register_user_mysql();
				
							
							//System.out.println(i);
						} catch (Exception ex) {
							ex.getStackTrace();
						}

					}

				}
			} catch (Exception ex) {

			}

		});

	}

	private void close(Stage stage) {
	
	stage.close();
	}
	void register_user_mysql() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
		Statement stmt = con.createStatement();

		stmt.executeQuery("create table user (account varchar(20),passwd varchar(25)");
	}
}
