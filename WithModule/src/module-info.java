module WithModule {
	requires javafx.graphics;
	//requires javafx.base;
	requires javafx.controls;
	//requires javafx.media;
	//requires javafx.swing;
	//requires javafx.web;
	requires javafx.fxml;
	
	opens Wdemo to javafx.fxml;
	exports Wdemo;
}