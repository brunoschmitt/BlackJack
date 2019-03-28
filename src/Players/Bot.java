package Players;

public class Bot {

	private Hand hand;
	private boolean standHit;
	private static Bot bot;

	public Bot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Bot getBot() {
		if (bot == null) {
			bot = new Bot();
		}
		return bot;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public boolean isStandHit() {
		return standHit;
	}

	public void setStandHit(boolean standHit) {
		this.standHit = standHit;
	}

}
