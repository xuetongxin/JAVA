package Teacher_Salary;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Choice extends Application {
	Choice() {
	}

	Input input = new Input();
	Pane pane = new Pane();
	HBox box = new HBox(10);
	Button bt1 = new Button("input");
	Button bt2 = new Button("update");
	Button bt3 = new Button("select");
	Button bt4 = new Button("delete");
	Label label1 = null;
	Label label2 = null;
	Label label3 = null;
	Label label4 = null;;
	Button btclose = new Button("Close");
	BorderPane borderpane = new BorderPane();
	GridPane gridpane = new GridPane();

	public void start(Stage stage) throws Exception {

		Label label1 = new Label("1.录入信息");
		label1.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		label1.setTextFill(Color.BLUE);
		Label label2 = new Label("2.更新信息");
		label2.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		label2.setTextFill(Color.BLUE);
		Label label3 = new Label("3.查询信息");
		label3.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		label3.setTextFill(Color.BLUE);
		Label label4 = new Label("4.删除信息");
		label4.setFont(Font.font("Time New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));
		label4.setTextFill(Color.RED);

		bt4.setTextFill(Color.RED);
		box.setAlignment(Pos.CENTER);
		box.setPadding(new Insets(0, 0, 10, 0));
		gridpane.setHgap(30);
		gridpane.setVgap(30);
		gridpane.add(label1, 0, 0);
		gridpane.add(label2, 0, 1);
		gridpane.add(label3, 0, 2);
		gridpane.add(label4, 0, 3);
		gridpane.setAlignment(Pos.CENTER);
		// Body();
		// Panel_Loyout(); // 面板布局
		Bt_Choice(stage); // 按键选项

		box.getChildren().addAll(bt1, bt2, bt3, bt4);
		borderpane.setCenter(gridpane);
		borderpane.setBottom(box);
		Scene scene = new Scene(borderpane, 400, 410);
		stage.setScene(scene);
		stage.setTitle("choice");
		stage.show();
	}

	/*
	 * public void Body() {
	 * 
	 * Label label1 = new Label("1.录入信息");
	 * label1.setFont(Font.font("Time New Roman", FontWeight.BOLD,
	 * FontPosture.ITALIC, 20)); label1.setTextFill(Color.BLUE); Label label2 = new
	 * Label("2.更新信息"); label2.setFont(Font.font("Time New Roman", FontWeight.BOLD,
	 * FontPosture.ITALIC, 20)); label2.setTextFill(Color.BLUE); Label label3 = new
	 * Label("3.查询信息"); label3.setFont(Font.font("Time New Roman", FontWeight.BOLD,
	 * FontPosture.ITALIC, 20)); label3.setTextFill(Color.BLUE); Label label4 = new
	 * Label("4.删除信息"); label4.setFont(Font.font("Time New Roman", FontWeight.BOLD,
	 * FontPosture.ITALIC, 20)); label4.setTextFill(Color.RED);
	 * 
	 * }
	 * 
	 * private void Panel_Loyout() { bt4.setTextFill(Color.RED);
	 * box.setAlignment(Pos.CENTER); box.setPadding(new Insets(0, 0, 10, 0));
	 * gridpane.setHgap(30); gridpane.setVgap(30); gridpane.add(label1, 0, 0);
	 * gridpane.add(label2, 0, 1); gridpane.add(label3, 0, 2); gridpane.add(label4,
	 * 0, 3); gridpane.setAlignment(Pos.CENTER); }
	 */
	private void Bt_Choice(Stage stage) {
		bt1.setOnAction(e -> {

			try {
				input.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		bt2.setOnAction(e -> {
			Update update = new Update();
			try {
				update.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		bt3.setOnAction(e -> {
			Select select = new Select();
			try {
				select.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		bt4.setOnAction(e -> {
			Delete delect = new Delete();
			try {
				delect.start(stage);
			} catch (Exception ex) {
				ex.getStackTrace();
			}
		});

		btclose.setOnAction(e -> {

		});
	}

}
