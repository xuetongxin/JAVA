module javafx {
	requires javafx.controls;
	requires javafx.graphics;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	exports application;
	exports Shape;
	exports Cource_Design;
}