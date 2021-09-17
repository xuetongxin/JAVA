module Teacher_Salary_Project {
	requires javafx.controls;
	requires java.sql;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	exports Teacher_Salary;
}
