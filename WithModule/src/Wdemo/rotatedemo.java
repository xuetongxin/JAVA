package Wdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class rotatedemo extends Application{
	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		StackPane pane=new StackPane();
		Button ok=new Button("OK");
		ok.setStyle("-fx-border-color:blue");
		pane.getChildren().add(ok);
		
		pane.setRotate(45);
		pane.setStyle("-fx-border-color :-fx-background-color:lightgray;");
		
		Scene scene=new Scene(pane,200,200);
		stage.setTitle("rotatedemo");
		stage.setScene(scene);
		stage.show();
	}
}