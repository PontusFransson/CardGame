package CardGame;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class gameMain extends Application {

	public static final double MARGIN = 10;
	public static final double WIDTH = (BJCard.WIDTH + MARGIN) * 7 + MARGIN;
	public static final double HEIGHT = (BJCard.HEIGHT + MARGIN) * 4 + MARGIN;

	public static Group root = new Group();

	public static Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		BJPlayer player1 = new BJPlayer();

		BJPlayer player2 = new BJPlayer();

		player2.setTranslateX(0);
		player2.setTranslateY(400);

		root.getChildren().addAll(player1, player2);

		primaryStage.setScene(scene);
		primaryStage.show();

		new AnimationTimer() {

			@Override
			public void handle(long now) {

				player1.showValue();
				player2.showValue();
				
				scene.setOnKeyPressed(event -> {


					if(event.getCode() == KeyCode.DIGIT1){

						player1.hit();

					}

					if(event.getCode() == KeyCode.DIGIT2){

						player2.hit();

					}

				});

			}

		}.start();

	}

}
