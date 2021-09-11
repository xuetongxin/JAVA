package Cource_Design;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class d extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		StackPane pane = new StackPane();
		Pane pane1 = new Pane();

		pane.setPadding(new Insets(11, 110, 11, 110));
		pane.setPrefHeight(10);

		pane1.setPadding(new Insets(11, 11, 11, 11));

		Image image = new Image("file:D:\\eclipse-workspace\\javafx\\bin\\Cource_Design\\image\\a.jpg");
		ImageView imageview = new ImageView(image);
		imageview.setFitHeight(1080);
		imageview.setFitWidth(1480);

		Label name = new Label("name");
		Label passwd = new Label("passwd");
		Text text = new Text("hello");
		TextField txfd1 = new TextField("hello java");
		txfd1.setPrefColumnCount(1);
		TextField txfd2 = new TextField();

		Text text1 = new Text(100, 100, "hello java");

		text1.setFont(Font.font("Courier", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 99));

		text1.setFill(Color.RED);
		// text1.setUnderline(true);
		// text1.setStrikethrough(true);

		pane1.getChildren().add(text1);

		// pane.getChildren().addAll(imageview);
		pane.getChildren().addAll(txfd1, passwd);
		Scene scene = new Scene(pane1, 200, 200);
		stage.setScene(scene);
		stage.setTitle("stackpane");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
