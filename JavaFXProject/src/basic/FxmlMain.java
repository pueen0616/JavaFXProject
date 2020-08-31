package basic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxmlMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent hbox = FXMLLoader.load(getClass().getResource("Root.fxml"));
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("FXML È­¸é");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
