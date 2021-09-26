package Teacher_Salary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	Pane pane = new Pane();
	GridPane  gridpane=new GridPane();
	BorderPane borderpane=new BorderPane();
	Button btokid =new Button("OK");
	Button btokname=new Button("OK");
	Button btreturn=new Button("return");
	@Override
	public void start(Stage stage) throws Exception {
		// TODO 自动生成的方法存根
		
		gridpane.setHgap(5);
		gridpane.setVgap(5);
		gridpane.setAlignment(Pos.CENTER);	
		gridpane.add(new Label("id:"), 0, 0);
		gridpane.add(new TextField(), 1, 0);
		gridpane.add(btokid, 2, 0);
		gridpane.add(new Label("name"), 0, 1);
		gridpane.add(new TextField(), 1, 1);
		gridpane.add(btokname, 2, 1);
		borderpane.setCenter(gridpane);
		btreturn.setAlignment(Pos.BOTTOM_CENTER);
		borderpane.setBottom(btreturn);
		
		btreturn.setOnAction(e->{
			Choice choice=new Choice();
			try {
				choice.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
		
		
		Id_Select(stage);
		
		
 		Scene scene = new Scene(borderpane, 400, 400);
		stage.setScene(scene);
		stage.setTitle("Select");
		stage.show();
	}
	
	void Id_Select(Stage stage) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
	//	Parperment ps=con.createStatement("select * from teacher_salary where id= ?");
		
		btokid.setOnAction(e->{
			IdSelect idselect=new IdSelect();
			try {
				idselect.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
	}
	
	void Name_Select(Stage stage) {
		btokid.setOnAction(e->{
			IdSelect idselect=new IdSelect();
			try {
				idselect.start(stage);
			} catch (Exception e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		});
	}
	
}
