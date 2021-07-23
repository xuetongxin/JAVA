package Wdemo;
import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.*;

public class b extends Application{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}
	public void  start(Stage stage) {
		stage.setTitle("hello world");
		Group root =new Group();
		Scene scene=new Scene(root,4000,4000,Color.BLACK);
		Text t=new Text("hello world!");
		t.setX(0);
		t.setY(20);
		t.setText("hello world");
		t.setFill(Color.YELLOW);
		root.getChildren().add(t);
		stage.setScene(scene);
		stage.show();
		
	}
}
