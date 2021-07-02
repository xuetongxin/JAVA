package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
	public void start(Stage PrimaryStage) {

		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 200);
		PrimaryStage.setTitle("myjava");
		PrimaryStage.setScene(scene);
		PrimaryStage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}