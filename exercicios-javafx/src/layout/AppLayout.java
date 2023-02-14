package layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene principal = new Scene(new TesteAncorPane(), 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layouts");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
