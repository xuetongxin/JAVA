package Cource_Design;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class c extends Application {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane pane = new BorderPane();

		pane.setTop(getHBox());
		// pane.setLeft(getVBox());

		Scene scene = new Scene(pane, 200, 500);
		stage.setTitle("VBox");
		stage.setScene(scene);
		stage.show();
	}

	private HBox getHBox() {
		HBox hbox = new HBox(9);
		hbox.setPadding(new Insets(11, 11, 11, 11));
		//hbox.setStyle("-fx-background-color: gold");
		hbox.getChildren().add(new Button("Computer"));
		hbox.getChildren().add(new Button("Chemistry"));
		hbox.getChildren().add(new ImageView(new Image("file:D:\\eclipse-workspace\\javafx\\bin\\Cource_Design\\image\\a.jif")));
		return hbox;
	}
	private Node getVBox() {
		// TODO 自动生成的方法存根
		return null;
	}

}
