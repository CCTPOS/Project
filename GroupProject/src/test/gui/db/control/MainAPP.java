package test.gui.db.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainAPP extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	//changed!!!
	//changed!!!
	//changed
	//Tina changed again
	//Tina changed to test Carl's version
	//carl changed
	//changed again 18.29
<<<<<<< HEAD
	 

=======
	
//tina 18.39
	//18.41
>>>>>>> branch 'master' of https://github.com/CCTPOS/Project.git
	@Override
	public void start(Stage primaryStage)throws Exception {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/GroupProject/src/test/gui/Main.fxml"));
			
            Scene scene = new Scene(root);
            //scene.getStylesheets().add("/GroupProject/src/stylesheets/TestDB.css");
            //scene.getStylesheets().add(getClass().getResource("/YouTubeFX/src/StyleSheets/TestDB.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("FXML is Simple");
            primaryStage.show();
        } catch (Exception e) {
			e.printStackTrace();
        }														
	
	}
}
