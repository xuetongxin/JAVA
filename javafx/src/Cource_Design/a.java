package Cource_Design;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class a extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO 自动生成的方法存根
		Group root = new Group();
		Pane pane = new Pane();

		Circle circle = new Circle();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();

		circle.setCenterX(100);
		circle.setCenterY(150);
		circle.setRadius(30);
		circle.setStroke(Color.BLUE);
		circle.setFill(Color.YELLOW);

		circle1.setCenterX(100);
		circle1.setCenterY(150);
		circle1.setRadius(10);
		circle1.setStroke(Color.RED);
		circle1.setFill(Color.WHITE);

		circle2.centerXProperty().bind(pane.widthProperty().divide(2));
		circle2.centerYProperty().bind(pane.heightProperty().divide(2));
		circle2.setRadius(50);
		circle2.setStroke(Color.RED);
		circle2.setFill(Color.WHITE);
		/*
		 * circle3.centerXProperty().bindBidirectional(circle2.centerXProperty());
		 * circle3.centerXProperty().bindBidirectional(circle2.centerYProperty());
		 * circle3.setRadius(50); circle3.setStroke(Color.BLUE);
		 * circle3.setFill(Color.YELLOW);
		 */

		// Pane pane=new Pane();
		root.getChildren().add(circle);
		root.getChildren().add(circle1);

		pane.getChildren().add(circle);
		pane.getChildren().add(circle1);
		pane.getChildren().add(circle2);
		// pane.getChildren().add(circle3);

		// Scene scene=new Scene(root,200,300);
		Scene scene = new Scene(pane, 200, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("login");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
