package Cource_Design;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
public class m extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		TableView<Data> table=new TableView();
		TableColumn id = new TableColumn<Object, Object>("id");
        TableColumn name = new TableColumn<Object, Object>("name");
        TableColumn phone = new TableColumn<Object, Object>("phone");
        TableColumn address = new TableColumn<Object, Object>("Address");
        id.getText();
        
        table.setMinHeight(5);
        table.setMinWidth(10);
        table.getColumns().addAll(id,name);
        Scene scene=new Scene(table,300,300);
        stage.setScene(scene);
        stage.show();
        
	}

	
}
