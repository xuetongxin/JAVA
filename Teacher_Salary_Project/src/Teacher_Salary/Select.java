package Teacher_Salary;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

class Select extends Application {
	Select() {
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		Pane pane = new Pane();
		GridPane  gridpane=new GridPane();
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.setAlignment(Pos.CENTER);
		BorderPane borderpane=new BorderPane();
		borderpane.setCenter(gridpane);
		Button btokid =new Button("OK");
		Button btokname=new Button("OK");
		Button btreturn=new Button("return");
		btreturn.setAlignment(Pos.BOTTOM_CENTER);
		
		borderpane.setBottom(btreturn);
		gridpane.add(new Label("id:"), 0, 0);
		gridpane.add(new TextField(), 1, 0);
		gridpane.add(btokid, 2, 0);
		gridpane.add(new Label("name"), 0, 1);
		gridpane.add(new TextField(), 1, 1);
		gridpane.add(btokname, 2, 1);
		
		
		btreturn.setOnAction(e->{
			Choice choice=new Choice();
			try {
				choice.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		
		btokid.setOnAction(e->{
			IdSelect idselect=new IdSelect();
			try {
				idselect.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		
		
		
 		Scene scene = new Scene(borderpane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Select");
		stage.show();
	}
}
