package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = (Parent)FXMLLoader.load(getClass().getResource("/application/Sample.fxml"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("CSS");
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}