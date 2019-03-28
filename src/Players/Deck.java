package Players;

import java.util.Collections;
import java.util.Vector;

public class Deck {
	private String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
	private Vector<String> deck1 = new Vector<String>();
	int contador = 52;
	private static Deck deck;
	
	public Deck() {
		
	}
	
	public static Deck getDeck() {
		if (deck == null) {
			deck = new Deck();
		}
		return deck;
	}
	
	
	
	public void shuffle() {
		for(int i = 0; i < cards.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				String carta = cards[i]+" of "+suits[j];
				deck1.add(carta);
			}
		}
		Collections.shuffle(deck1);
		//for debugging purposes
		//for (int i = 0; i < 52; i++) {
			//System.out.println(deck.get(i));
		//}
	}
	 
	public int valor(){
		int cont = 0;
		for (int i = 0;i<52;i++){
			if (deck1.toString().substring(0, 2).equals("ace") || deck1.toString().substring(0, 2).equals("jack")
					|| deck1.toString().substring(0, 2).equals("king") || deck1.toString().substring(0, 2).equals("queen")) {
				cont = 11;
			}
			
			for (int j=2; i<11; i++) {
				
			if (deck1[i]toString().contains(Integer.toString(j))) {
				cont = j;
			}
		}
		}
		return cont;
		
	}
	
	public String giveCards() {
		contador--;
		return deck1.get(contador);
	}
}
