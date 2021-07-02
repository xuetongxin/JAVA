package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultiplwStageDemo extends Application {

	@Override 
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Scene scene = new Scene(new Button("Ok"), 200, 250);
		stage.setTitle("myjava");
		stage.setScene(scene);
		stage.show();

		Stage Primarystage = new Stage();
		Primarystage.setTitle("Second Stage");
		Primarystage.setScene(new Scene(new Button("New Stage"), 200, 200));
		Primarystage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
