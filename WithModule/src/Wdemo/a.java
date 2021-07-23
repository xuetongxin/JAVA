package Wdemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class a extends Application{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		stage.setTitle("hello java");
		Group root =new Group();
		Scene scene=new Scene(root,300,300,Color.BLUE);
		
		Text t=new Text("hello java");
		t.setX(50);
		t.setY(50);
		t.setText("hello go");
		t.setFill(Color.BLACK);
		t.setFont(Font.font(null, FontWeight.BOLD, 30));

        Reflection r = new Reflection();
        r.setFraction(1);

        t.setEffect(r);

        root.getChildren().add(t); 
        stage.setScene(scene);
        stage.show();



	}

}
