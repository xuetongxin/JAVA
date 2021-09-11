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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class f extends Application {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	// TextTest text = new TextTest();
	

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Text text = new Text(100, 100, "hello java");
		Pane pane = new Pane(text);
		
		
		
		
		text.setFill(Color.BLACK);
		text.setFont(new Font("Time New Roman", 90));
		text.setSmooth(true);
		
		HBox hbox = new HBox(10);
		Button left = new Button("LEFT");
		Button right = new Button("RIGHT");
		Button up = new Button("UP");
		Button down = new Button("DOWN");
		hbox.getChildren().addAll(left, right, up, down);
		hbox.setAlignment(Pos.BOTTOM_CENTER);
		
		/*
		
		
		left.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				text.setX(text.getX() > 0 ? text.getX() - 5 : 0);
			}
		});
		right.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				text.setX(text.getX() < pane.getWidth() - 5 ? text.getX() + 5 : pane.getWidth() - 5);
			}
		});
		up.setOnAction(e -> text.setY(text.getY() > 0 ? text.getY() - 5 : 10));
		
		down.setOnAction(e -> text.setY(text.getY() < pane.getHeight() ? text.getY() + 5 : pane.getHeight()));

		BorderPane borderpane = new BorderPane();
		borderpane.setTop(pane);
		borderpane.setBottom(hbox);
		borderpane.setPadding(new Insets(11, 11, 11, 11));
	
		*/
		text.setOnMouseDragged(e ->{ 
		text.setX(e.getX());
		text.setY(e.getY());
		});
		
		Scene scene = new Scene(pane, 200, 200);
		stage.setScene(scene);
		stage.setTitle("");
		stage.show();
	}
}
/*
 * class TextLeftHandler implements EventHandler<ActionEvent> {
 * 
 * @Override public void handle(ActionEvent arg0) { // TODO 自动生成的方法存根
 * //text.left(); text.setX(text.getX() >0 ? text.getX() -5 : 0 ); } }
 * 
 * class TextRightHandler implements EventHandler<ActionEvent> {
 * 
 * @Override public void handle(ActionEvent arg0) { // TODO 自动生成的方法存根
 * //text.right(); text.setX(text.getX()<pane.getWidth()-5? text.getX()+
 * 5:pane.getWidth()-5); } }
 * 
 * class TextUpHandler implements EventHandler<ActionEvent> {
 * 
 * @Override public void handle(ActionEvent arg0) { // TODO 自动生成的方法存根
 * //text.up(); } } class TextDownHandler implements EventHandler<ActionEvent> {
 * 
 * @Override public void handle(ActionEvent arg0) { // TODO 自动生成的方法存根
 * //text.down(); } } }
 * 
 */