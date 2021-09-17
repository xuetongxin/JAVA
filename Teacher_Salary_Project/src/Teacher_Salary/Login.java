package Teacher_Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Login extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	Statement stmt = null;
	ResultSet rs_passwd = null;
	String result_passwd = null;

	Choice choice = new Choice();
	private StackPane stackpane = new StackPane();
	private ImageView imageview = new ImageView(
			new Image("file:D:\\eclipse-workspace\\Teacher_Salary_Project\\bin\\Teacher_Salary\\image\\R-C.jpg"));
	private HBox hbox = new HBox(10);
	private GridPane gridpane = new GridPane();
	private Button login_bt = new Button("Login"); // 设置登录按钮
	private Button singup_bt = new Button("SingUp"); // 设置注册按钮
	private Label lb1 = new Label("account:"); // 设置用户名标签
	private Label lb2 = new Label("passwd:"); // 设置密码标签
	private TextField txfd1 = null; // 设置用户名填充域
	private PasswordField txfd2 = null; // 设置密码填充域 密码不回显

	@Override
	public void start(Stage stage) throws Exception {

		Txfd1_attribute(); // 设置用户名填充属性
		Txfd2_attribute(); // 设置密码填充属性
		body();
		LogIn(stage); // 调用登录方法
		SingeUp(stage); // 调用注册方法

		hbox.getChildren().add(singup_bt);
		stackpane.getChildren().addAll(imageview, hbox, gridpane);
		Scene scene = new Scene(stackpane, 300, 300);
		stage.setScene(scene);
		stage.setTitle("log");
		stage.show();

	}

	private void LogIn(Stage stage) throws SQLException {
		login_bt.setOnAction(e -> {

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

			} catch (Exception ex) {
				ex.getStackTrace();
			}

			try {
				while (rs1.next()) {

					if (rs1.getString(1).matches(txfd1.getText())) {

						while (rs2.next()) {

							if (rs2.getString(1).matches(txfd2.getText())) {

								try {

									choice.start(stage);
								} catch (Exception e1) {

									e1.printStackTrace();
								}

							}

						}
					} else {
						
					}

				}
			} catch (Exception ex) {

			}
		});

	}

	private void SingeUp(Stage stage) {
		singup_bt.setOnAction(e -> {
			Register register = new Register();
			try {
				register.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
	}

	private void body() {

		imageview.setFitHeight(810);
		imageview.setFitWidth(1535); // 背景图片属性
		hbox.setAlignment(Pos.BOTTOM_LEFT); // 注册按钮位置设置在左下
		hbox.setPadding(new Insets(0, 0, 10, 10));
		gridpane.setHgap(5);
		gridpane.setVgap(5); // 节点间距离
		gridpane.add(lb1, 0, 0);
		gridpane.add(txfd1, 1, 0);
		gridpane.add(lb2, 0, 1);
		gridpane.add(txfd2, 1, 1);
		gridpane.add(login_bt, 1, 2);
		gridpane.setAlignment(Pos.CENTER);
	}

	public void Txfd1_attribute() {
		txfd1 = new TextField() {
			public void replaceText(int start, int end, String text) {
				if (!text.matches("[a~z . , /]")) {
					super.replaceText(start, end, text);
				}
			}

			public void replaceSelection(String text) {
				if (text.matches("[a~z . , /]")) {
					super.replaceSelection(text);
				}
			}
		};

		txfd1.setPromptText("8~20数字、字母 不能存在符号");
		// txfd1.setPrefColumnCount(5);

	}

	public void Txfd2_attribute() {
		txfd2 = new PasswordField() {
			@Override
			public void replaceText(int start, int end, String text) {
				if (!text.matches("[. / , ' ; :]")) {
					super.replaceText(start, end, text);
				}
			}

			public void replaceSelection(String text) {
				if (!text.matches("[. / , ' ; :]")) {
					super.replaceSelection(text);
				}
			}
		};
		txfd2.setPromptText("8~20数字、字母 能存在符号");
		txfd2.setPrefColumnCount(15);
	}

}
