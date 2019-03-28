package Players;

public class Hand extends Deck {

	private String[] hand = new String[2];

	public Hand(String _card1, String _card2) {
		hand[0] = _card1;
		hand[1] = _card2;
	}

	public String getFirstCard() {
		return hand[0];
	}

	public String getSecondCard() {
		return hand[1];
	}

	public int valor(){
		int cont = 0;
		for (int i = 0;i<2;i++){
			if (hand[i].substring(0, 2).equals("ace") || hand[i].substring(0, 2).equals("jack")
					|| hand[i].substring(0, 2).equals("king") || hand[i].substring(0, 2).equals("queen")) {
				cont += 11;
			}
			
			for (int j=2; i<11; i++) {
				
			if (hand[i].contains(Integer.toString(j))) {
				cont = j;
			}
		}
		}
		return cont;
		
	}
}
