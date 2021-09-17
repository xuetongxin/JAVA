package Cource_Design;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class k extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, 300, 250, Color.WHITE);

    TextField field = new TextField() {
      @Override
      public void replaceText(int start, int end, String text) {
        if (!(text.matches("[a-z]"))){
          super.replaceText(start, end, text);
        }
      }

      @Override
      public void replaceSelection(String text) {
        if (!text.matches("[a-z]")) {
          super.replaceSelection(text);
        }
      }
    };

    root.getChildren().add(field);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
//更多请阅读：https://www.yiibai.com/javafx/javafx_textfield.html

