package trhekegmu.coins;

public abstract class Coin {

	private Double Denom;
	
	public Coin(double pD){
		Denom = pD;
		
	}
	
	public double getDenom() {
		return Denom;
	}
}
