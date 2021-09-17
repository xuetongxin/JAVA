package Cource_Design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
 
public class l extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
	 // Scanner sc=new Scanner(System.in);
	  
    Scene scene = new Scene(new Group());
    stage.setTitle("Label Sample");
    stage.setWidth(500);
    stage.setHeight(180);

    
    
    HBox hbox = new HBox();

    Label label1 =null;
    
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl","root","xsl203457");
        Statement stmt =con.createStatement();

        ResultSet rs=stmt.executeQuery("select * from employee");
        while(rs.next()){
        label1 = new Label(String.valueOf(rs.getInt(1)));
        }
        con.close();
        }
        catch(Exception ex){
                System.out.println(ex);
                }
    label1.setPrefWidth(100);
    label1.setWrapText(false);
    
    hbox.setSpacing(10);
    hbox.getChildren().add((label1));
    ((Group) scene.getRoot()).getChildren().add(hbox);

    stage.setScene(scene);
    stage.show();
  }
}


