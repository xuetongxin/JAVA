package Wdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class showcircle extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane=new Pane();
		Circle circle =new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		pane.getChildren().add(circle);
		
		Scene scene=new Scene(pane,200,200);
		stage.setTitle("show circle");
		stage.setScene(scene);
		stage.show();
	}
	
}
