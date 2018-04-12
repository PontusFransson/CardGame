package CardGame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CardDeck extends Application {

	public static final double MARGIN = 10;
	public static final double WIDTH = (Card.WIDTH + MARGIN) * 7 + MARGIN;
	public static final double HEIGHT = (Card.HEIGHT + MARGIN) * 4 + MARGIN;

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		for (int i = 0; i < 13; i++) {

			Card c = new Card(1, i + 2);
			c.setTranslateX((i % 7) * (Card.WIDTH + MARGIN) + MARGIN + (Card.WIDTH / 2 * (i / 7)));
			c.setTranslateY((i / 7) * (Card.HEIGHT + MARGIN) + MARGIN);

			root.getChildren().add(c);

		}
		
		for (int i = 0; i < 13; i++) {

			Card c = new Card(3, i + 2);
			c.setTranslateX((i % 7) * (Card.WIDTH + MARGIN) + MARGIN + (Card.WIDTH / 2 * (i / 7)));
			c.setTranslateY((i / 7) * (Card.HEIGHT + MARGIN) + MARGIN + 2 * (Card.HEIGHT + MARGIN));

			root.getChildren().add(c);

		}

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
