package Wdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class flowpane extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		FlowPane pane=new FlowPane();
		//pane.setPadding(new Insets(11,12,13,14));
		//pane.setHgap(5);
		//pane.setVgap(5);
		
		pane.getChildren().addAll(new Label("First Name"),new TextField(),new Label("MI:"));
		TextField tfMi=new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi,new Label("Last Name"),new TextField());
		
		Scene scene=new Scene(pane ,250,250);
		stage.setTitle("shoeflowPane");
		stage.setScene(scene);
		stage.show();
	}
}
