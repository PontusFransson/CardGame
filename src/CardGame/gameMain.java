package CardGame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class gameMain extends Application {

	public static final double MARGIN = 10;
	public static final double WIDTH = (BJCard.WIDTH + MARGIN) * 7 + MARGIN;
	public static final double HEIGHT = (BJCard.HEIGHT + MARGIN) * 4 + MARGIN;
	public static BJPlayer player1, player2;

	public static Group root = new Group();

	public static Scene scene = new Scene(root, WIDTH, HEIGHT, Color.FORESTGREEN);

	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		player1 = new BJPlayer();

		player2 = new BJPlayer();

		player2.setTranslateX(0);
		player2.setTranslateY(300);

		root.getChildren().addAll(player1, player2);

		player1.playerBoard();
		player2.playerBoard();

		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

	public static void whoWon() {

		Rectangle rec = new Rectangle(gameMain.WIDTH, gameMain.HEIGHT);
		rec.setFill(Color.BLACK);
		rec.setOpacity(0.80);
		
		int compare = player1.compare(player2);
		Text winText = new Text();
		if (compare == 1) {
			winText.setText("PLAYER1 WON!");
		} else if (compare == 0) {
			winText.setText("IT'S A DRAW!");
		} else {
			winText.setText("PLAYER2 WON!");
		}
		
		winText.setFill(Color.GOLD);
		winText.setFont(new Font(100));
		winText.setTranslateX(gameMain.WIDTH/2-winText.getBoundsInLocal().getWidth()/2);
		winText.setTranslateY(325);

		root.getChildren().addAll(rec, winText);
	}

}
