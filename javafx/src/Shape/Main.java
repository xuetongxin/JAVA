package Shape;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Fonts");
        Group root = new Group();
        Scene scene = new Scene(root, 550, 250, Color.web("0x0000FF"));

        Circle circle = new Circle();
        circle.setCenterX(100.0f);
        circle.setCenterY(100.0f);
        circle.setRadius(50.0f);

        root.getChildren().add(circle);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_circle_arc.html#article-start

