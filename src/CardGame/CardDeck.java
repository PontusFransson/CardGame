
package CardGame;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public CardDeck(){
		
		for (int color = 1; color <= 4; color++) {
			for (int value = 2; value <= 14; value++) {
				cards.add(new Card(color,value));
			}
		}
		
	}
	
	public void shuffle(){
		
		Collections.shuffle(cards);
		
	}
	
	public Card draw(){
		
		Card card = cards.get(0);
		cards.remove(0);
		return card;
		
	}
	
}