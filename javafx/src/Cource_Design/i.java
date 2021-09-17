package Cource_Design;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class i extends Application{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}
	Circle circle=new Circle(60);
	Rectangle re=new Rectangle(120,120);
	StackPane pane=new StackPane();
	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		re.setFill(Color.WHITE);
		re.setStroke(Color.BLACK);
		pane.getChildren().addAll(re,circle);
		
		Scene scene=new Scene(pane,300,300);
		stage.setScene(scene);
		stage.show();
		
		pane.widthProperty().addListener(ov->{resize();});
		pane.heightProperty().addListener(ov->{resize();});
	}
	void resize() {
		double length=Math.min(pane.getWidth(), pane.getHeight());
		circle.setRadius(length/2-15);
		re.setWidth(length-30);
		//re.setHeight(length-30);
	}
}
