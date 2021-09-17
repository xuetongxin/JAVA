package Teacher_Salary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Successful_SingUp extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		Login login=new Login();
		Register register=new Register();
		HBox hbox=new HBox(200);
		GridPane gridpane=new GridPane();
		BorderPane borderpane=new BorderPane();
		Button btok=new Button("确认");
		Button btcancle=new Button("取消");
		
		gridpane.getChildren().add(new Label("注册成功!"));
		hbox.getChildren().addAll(btok,btcancle);
		borderpane.setCenter(gridpane);
		borderpane.setBottom(hbox);
		
		Scene scene=new Scene(borderpane,400,400);
		stage.setScene(scene);
		stage.setTitle("");
		stage.show();
		
		btok.setOnAction(e->{
			try {
				login.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		btcancle.setOnAction(e->{
			try {
				register.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		
	}
	
}
