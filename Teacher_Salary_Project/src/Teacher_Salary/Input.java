package Teacher_Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class Input extends Application {

	Input() {
	}

	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Button btok = new Button("OK");
		Button btreturn = new Button("Return");
		Button btreset = new Button("Reset");
		GridPane gridpane = new GridPane();

		TextField txfd1 = new TextField();
		TextField txfd2 = new TextField();
		TextField txfd3 = new TextField();
		TextField txfd4 = new TextField();

		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.setAlignment(Pos.CENTER);
		gridpane.add(new Label("id:"), 0, 0);
		gridpane.add(txfd1, 1, 0);
		gridpane.add(new Label("name:"), 0, 1);
		gridpane.add(txfd2, 1, 1);
		gridpane.add(new Label("position:"), 0, 2);
		gridpane.add(txfd3, 1, 2);
		gridpane.add(new Label("salary:"), 0, 3);
		gridpane.add(txfd4, 1, 3);
		gridpane.add(btreturn, 0, 5);
		gridpane.add(btok, 1, 5);
		gridpane.add(btreset, 3, 5);

		btreturn.setOnAction(e -> {
			Choice choice = new Choice();
			try {
				choice.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});

		btok.setOnAction(e -> {
			Connection con = null;
			PreparedStatement ps = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
				ps = con.prepareStatement("insert into teacher_salary (id,name,position,salary) values (?,?,?,?)");
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
		stage.setTitle("input");
		stage.show();

		gridpane.widthProperty().addListener(ov -> {
			resize();
		});
		gridpane.heightProperty().addListener(ov -> {
			resize();
		});
	}

	void resize() {

	}
}
