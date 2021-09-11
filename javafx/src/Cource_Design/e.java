package Cource_Design;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class e extends Application {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	private CirclePane circlepane = new CirclePane();

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存

		HBox hbox = new HBox(10);
		hbox.setAlignment(Pos.BASELINE_CENTER);
		Button btlarge = new Button("btlarge");
		Button btshrink = new Button("btshrink");

		btlarge.setStyle("-fx-background-Color:pink");
		btshrink.setStyle("-fx-background-Color:red");

		hbox.getChildren().addAll(btlarge, btshrink);

		btlarge.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				circlepane.large();
			}
		});

		btshrink.setOnAction(new Shrink());

		BorderPane borderpane = new BorderPane();
		borderpane.setPadding(new Insets(0, 0, 20, 0));
		borderpane.setCenter(circlepane);
		borderpane.setBottom(hbox);

		Scene scene = new Scene(borderpane, 250, 250);
		stage.setScene(scene);
		stage.setTitle("circle");
		stage.show();

	}

	/*
	 * public class EnlargeHandler implements EventHandler<ActionEvent>{
	 * 
	 * @Override public void handle(ActionEvent e) { // TODO 自动生成的方法存根
	 * circlepane.large(); } }
	 */
	public class Shrink implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			// TODO 自动生成的方法存根
			circlepane.shrink();
		}

	}

}

class CirclePane extends StackPane {
	Circle circle = new Circle(30);

	CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BLUE);
	}

	void large() {
		circle.setRadius(circle.getRadius() + 2);
	}

	void shrink() {
		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());

	}

}
