package CardGame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class spel extends Application {

	public static final double MARGIN = 10;
	public static final double WIDTH = (Card.WIDTH + MARGIN) * 7 + MARGIN;
	public static final double HEIGHT = (Card.HEIGHT + MARGIN) * 4 + MARGIN;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		}

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
