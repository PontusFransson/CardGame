package CardGame;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BJPlayer extends Group {

	Text valueText = new Text();

	static CardDeck deck = new CardDeck();

	ArrayList<BJCard> hand = new ArrayList<BJCard>();
	boolean hasStopped = false;

	public BJPlayer() {

		deck.shuffle();
		hit();
		hit();

		valueText.setTranslateX(BJCard.WIDTH - 20);
		valueText.setTranslateY(BJCard.HEIGHT + 50);
		valueText.setFont(new Font(50));

		this.getChildren().add(valueText);

	}

	public int getHandValue() {

		int sum = 0;

		int ACounter = 0;
		
		for (int i = 0; i < hand.size(); i++) {

			BJCard c = hand.get(i);

			
			int temp = c.getValue();

			if (temp == 14) {
				ACounter++;
				temp = 11;
			} else if (temp > 10) {
				temp = 10;
			}

			sum += temp;
		}
		
		for (BJCard card : hand) {

			if (card.getValue() == 11) {

				ACounter ++;
				
			}

		}

		for (int i = 0; i < ACounter; i++) {
			
			if(sum > 21){
				
				sum -= 10;
				
			}
			
		}
		
		return sum;
	}

	public void hit() {

		if (!hasStopped && getHandValue() < 21) {

			BJCard c = deck.draw();
			c.setTranslateX(hand.size() * BJCard.WIDTH + 10);
			hand.add(c);
			this.getChildren().add(c);

		}

	}

	public void stand() {

		hasStopped = true;

	}

	public void showValue() {

		valueText.setText("Value: " + getHandValue());

	}

}
