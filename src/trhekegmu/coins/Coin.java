package trhekegmu.coins;

public abstract class Coin {

	private int Denom;
	
	public Coin(int pD){
		Denom = pD;
		
	}
	
	public int getDenom() {
		return Denom;
	}
}
