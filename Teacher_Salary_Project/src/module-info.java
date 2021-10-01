module Teacher_Salary_Project {
	requires javafx.controls;
	requires java.sql;
	requires javafx.graphics;
	
	
	opens Teacher_Salary to javafx.graphics, javafx.fxml;
	exports Teacher_Salary;
}
