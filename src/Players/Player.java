package Players;

public class Player {

	private int saldo;
	private Hand hand;
	private boolean standHit;
	private boolean quit;
	private int aposta;
	private static Player player;

	public Player() {
	}

	public static Player getPlayer() {
		if (player == null) {
			player = new Player();

		}
		return player;
	}

	public int getAposta() {
		return aposta;
	}

	public void setAposta(int aposta) {
		this.aposta = aposta;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean isStandHit() {
		return standHit;
	}

	public void setStandHit(boolean standHit) {
		this.standHit = standHit;
	}

	public boolean isQuit() {
		return quit;
	}

	public void setQuit(boolean quit) {
		this.quit = quit;
	}

}
