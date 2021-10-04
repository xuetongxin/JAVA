package Teacher_Salary;

import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select extends Application {
    Select() {
    }

    TableView<Teacher> table = new TableView<>();
    ObservableList<Teacher> data = FXCollections.observableArrayList();

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void start(Stage stage) throws Exception {

        TableColumn Id_Column = new TableColumn("ID");
        Id_Column.setMinWidth(100);
        Id_Column.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn Name_Column = new TableColumn("NAME");
        Name_Column.setMinWidth(100);
        Name_Column.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn Position_Column = new TableColumn("Position");
        Position_Column.setMinWidth(100);
        Position_Column.setCellValueFactory(new PropertyValueFactory<>("position"));

        TableColumn Salary_Column = new TableColumn("Salary");
        Salary_Column.setMinWidth(100);
        Salary_Column.setCellValueFactory(new PropertyValueFactory<>("salary"));

        Mysql_Select();

        table.getColumns().addAll(Id_Column, Name_Column, Position_Column, Salary_Column);

        // 设置可编辑（列需要同时设置才有用）
        table.setEditable(true);
        // （很有用）宽度绑定窗口的宽度（意思窗口大小改变，它也跟着改变，自适应效果）
        table.prefWidthProperty().bind(stage.widthProperty());

        Scene scene = new Scene(table, 400, 300);
        stage.setScene(scene);
        stage.show();

    }

    public static class Teacher {

        private final SimpleIntegerProperty id;
        private final SimpleStringProperty name;
        private final SimpleStringProperty position;
        private final SimpleDoubleProperty salary;

        Teacher() {
            id = null;
            name = null;
            position = null;
            salary = null;
        }

        Teacher(int ssPid, String sspName, String ssPosition, double sSalary) {
            this.id = new SimpleIntegerProperty(ssPid);
            this.name = new SimpleStringProperty(sspName);
            this.position = new SimpleStringProperty(ssPosition);
            this.salary = new SimpleDoubleProperty(sSalary);
        }

        public int getId() {
            return id.get();
        }

        public void setId(int ssPid) {
            id.set(ssPid);
        }

        public String getName() {
            return name.get();
        }

        public void setName(String sspName) {
            name.set(sspName);
        }

        public String getPosition() {
            return position.get();
        }

        public void setPosition(String ssPosition) {
            position.set(ssPosition);
        }

        public double getSalary() {
            return salary.get();
        }

        public void setSalary(double sSalary) {
            salary.set(sSalary);
        }
    }

    private void Mysql_Select() {
        Teacher teacher = new Teacher();
        ResultSet rs1 = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xsl", "root", "xsl203457");
            Statement stmt = con.createStatement();
            rs1 = stmt.executeQuery("select * from teacher_salary");

            while (rs1.next()) {
                // 将数据存入数据列表
                data.add(new Teacher(rs1.getInt(1), rs1.getString(2), rs1.getString(3), rs1.getDouble(4)));
                table.setItems(data);
            }

        } catch (Exception ex) {
            ex.getStackTrace();
        }

    }

}