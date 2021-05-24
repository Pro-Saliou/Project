import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavafxSample extends Application {  
   
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root= new Group();
		Scene scene = new Scene(root,600, 300);
	      scene.setFill(Color.BROWN);  
		primaryStage.setTitle("Sample Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	} 
	
	public static void main(String args[]){   
		   launch(args);      
		}  
} 