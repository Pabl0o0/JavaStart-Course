package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = (Parent)FXMLLoader.load(getClass().getResource("/view/ContentPane.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Text Converter");
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}