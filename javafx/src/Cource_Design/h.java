package Cource_Design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class h extends Application {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	Choice choice = new Choice();

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		GridPane gridpane = new GridPane();
		BorderPane borderpane = new BorderPane();
		Button button = new Button("login");

		Label lb1 = new Label("account");
		Label lb2 = new Label("passwd");

		gridpane.setHgap(5);

		gridpane.setVgap(5);
		gridpane.add(lb1, 0, 0);
		TextField txfd1 = new TextField();
		gridpane.add(txfd1, 1, 0);
		gridpane.add(lb2, 0, 1);
		TextField txfd2 = new TextField();
		gridpane.add(txfd2, 1, 1);
		gridpane.add(button, 1, 2);
		gridpane.setAlignment(Pos.CENTER);
		borderpane.setCenter(gridpane);

		System.out.print(txfd1.getText());
		/*
		 * button.setOnAction(e -> { if (txfd1.getText().equals("203457") &&
		 * txfd2.getText().equals("xsl203457")) try { input.start(stage); } catch
		 * (Exception e1) { // TODO 自动生成的 catch 块 e1.printStackTrace(); } });
		 */
		button.setOnAction(e -> {
			try {
				choice.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		Scene scene = new Scene(borderpane, 200, 200);
		stage.setScene(scene);
		stage.setTitle("stackpane");
		stage.show();
	}
}

class Choice extends Application {
	Choice() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane = new Pane();
		HBox box = new HBox(10);
		BorderPane borderpane = new BorderPane();
		GridPane gridpane = new GridPane();

		Button bt1 = new Button("input");
		Button bt2 = new Button("update");
		Button bt3 = new Button("select");
		Button bt4 = new Button("delete");
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(bt1, bt2, bt3, bt4);

		gridpane.add(new Label("1.录入信息"), 0, 0);
		gridpane.add(new Label("1.更新信息"), 0, 1);
		gridpane.add(new Label("1.查询信息"), 0, 2);
		gridpane.add(new Label("1.删除信息"), 0, 3);
		gridpane.setAlignment(Pos.CENTER);

		bt1.setOnAction(e -> {
			Input input = new Input();
			try {
				input.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		bt2.setOnAction(e -> {
			Input input = new Input();
			try {
				input.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		bt3.setOnAction(e -> {
			Input input = new Input();
			try {
				input.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		bt4.setOnAction(e -> {
			Input input = new Input();
			try {
				input.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		borderpane.setCenter(gridpane);
		borderpane.setBottom(box);
		Scene scene = new Scene(borderpane, 400, 300);
		stage.setScene(scene);
		stage.setTitle("choice");
		stage.show();
	}

}

class Input extends Application {
	Input() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Button btok = new Button("确认");
		Button btreturn=new Button("返回");
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
		gridpane.add(btreturn,0,5);
		gridpane.add(btok, 1, 5);

		btreturn.setOnAction(e->{
			Choice choice =new Choice();
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

		Scene scene = new Scene(gridpane, 300, 300);
		stage.setScene(scene);
		stage.setTitle("input");
		stage.show();
	}

}

class Update extends Application {
	Update() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根

	}

}

class Select extends Application {
	Select() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根

	}

}

class Delete extends Application {
	Delete() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根

	}

}