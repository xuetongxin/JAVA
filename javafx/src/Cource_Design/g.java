package Cource_Design;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class g extends Application{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane=new Pane();
		Text text=new Text(20,20,"hello java");
		pane.getChildren().add(text);
		text.setOnMouseDragged(e ->{ 
		text.setX(e.getX());
		text.setY(e.getY());
		});
		
	   Scene scene=new Scene(pane,200,200);
	   stage.setScene(scene);
	   stage.setTitle("Mounce");
	   stage.show();
	}
	
}
