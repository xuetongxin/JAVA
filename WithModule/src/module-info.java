module WithModule {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens Wdemo to javafx.fxml;
	exports Wdemo;
}