package Teacher_Salary;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class a extends Application implements EventHandler{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}
	Button bt1;
	Button bt2;
	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane=new HBox();
		
		bt1 = new Button("b");
		bt2=new Button("c");
		
		bt1.setOnAction(this);
		bt2.setOnAction(this);
		
		pane.getChildren().addAll(bt1,bt2);
		Scene scene=new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("a");
		stage.show();
		
	
		
		
	}
	@Override
	public void handle(Event event) {
		// TODO 自动生成的方法存根
		if(event.getSource()==bt1) {
			System.out.print("hello");
			Stage stage=new Stage();
			
			stage.setTitle("b");
			stage.showAndWait();
		}	
		else
			System.out.print("kkk");
	}
	
	
}