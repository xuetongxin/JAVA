package Cource_Design;

import java.util.List;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class b extends Application {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根

		Image image = new Image("file:D:\\eclipse-workspace\\javafx\\bin\\Cource_Design\\image\\a.jpg");
		ImageView imageview = new ImageView(image);
		imageview.setFitHeight(666);
		imageview.setFitWidth(666);

		Pane pane = new Pane();
		FlowPane pane1 = new FlowPane();
		GridPane pane2 = new GridPane();
		BorderPane pane3 = new BorderPane();

		pane.getChildren().add(imageview);
		pane.getChildren().add(new Label("a"));
		pane.getChildren().add(new TextField());

		// pane.setPadding(new Insets(10,10,10,10));
		// pane.setPrefHeight(90);
		// pane.setVgap(5);

		pane2.setAlignment(Pos.CENTER);
		pane2.setHgap(5);
		pane2.setVgap(3);

		// pane.getChildren().addAll(new Label("First Name:"),new TextField(),new
		// Label("sex"));
		// TextField text=new TextField();
		// text.setPrefColumnCount(1);
		// pane.getChildren().addAll(text,new Label("Last Name:"),new TextField());

		// pane2.getChildren().add(imageview);
		pane2.add(new Label("first Name:"), 0, 0);
		pane2.add(new TextField(), 1, 0);
		pane2.add(new Label("Last Name:"), 0, 1);
		pane2.add(new TextField(), 1, 1);
		Button bt = new Button("Add Name");
		pane2.add(bt, 0, 2);
		GridPane.setHalignment(bt, HPos.RIGHT);

		pane3.setTop(new CustomPane("TOP"));
		pane3.setLeft(new CustomPane("Left"));

		Scene scene = new Scene(pane3, 500, 300);
		stage.setTitle("image");
		stage.setScene(scene);
		stage.show();
	}

}

class CustomPane extends StackPane {

	CustomPane(String title) {

		getChildren().add(new Label(title));
		setStyle("-fx-Fonts-color:yellow;-fx-background-color:pink");
		setPadding(new Insets(11, 1, 13, 1));
	}
}
