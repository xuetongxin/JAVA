package Teacher_Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Update extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Button btupdate = new Button("Update");
		Button btreturn = new Button("Reture");
		Button btreset = new Button("Reset");

		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setHgap(5);
		gridpane.setVgap(5);

		TextField txfd1 = new TextField();
		TextField txfd2 = new TextField();
		TextField txfd3 = new TextField();
		TextField txfd4 = new TextField();

		gridpane.add(new Label("id:"), 0, 0);
		gridpane.add(txfd1, 1, 0);
		gridpane.add(new Label("name:"), 0, 1);
		gridpane.add(txfd2, 1, 1);
		gridpane.add(new Label("position:"), 0, 2);
		gridpane.add(txfd3, 1, 2);
		gridpane.add(new Label("salary:"), 0, 3);
		gridpane.add(txfd4, 1, 3);
		gridpane.add(btreturn, 0, 5);
		gridpane.add(btupdate, 1, 5);
		gridpane.add(btreset, 3, 5);

		btupdate.setOnAction(e -> {
			Connection con = null;
			PreparedStatement ps = null;
			PreparedStatement ps1 = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");

				if (txfd1.getText().equals(null)) {
					ps = con.prepareStatement("update teacher_salary set name=?,position=?,salary=? where id=?;");
					ps1 = con.prepareStatement("select id from cource_salary where name=?");

					// double id=ps1.setDouble(1,ps1.get);
					// ps.setDouble(4, id);
					ps.setString(1, txfd2.getText());
					ps.setString(2, txfd3.getText());
					ps.setInt(3, Integer.parseInt(txfd4.getText()));
					int i = ps.executeUpdate();
					System.out.println(i);

				}

				ps.setDouble(1, Double.parseDouble(txfd1.getText()));
				ps.setString(2, txfd2.getText());
				ps.setString(3, txfd3.getText());
				ps.setInt(4, Integer.parseInt(txfd4.getText()));
				int i = ps.executeUpdate();
				System.out.println(i);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		btreturn.setOnAction(e -> {
			Choice choice = new Choice();
			try {
				choice.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});

		btreset.setOnAction(e -> {
			Input input = new Input();
			try {
				input.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});

		Scene scene = new Scene(gridpane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Select");
		stage.show();
	}

}