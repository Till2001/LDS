package q1;

/**
 * @author  Andermahr
 */
public class Schueler {

	private String zName;
	private Schueler zNachfolger;
	public Schueler(String pName) {
		zName = pName;
		zNachfolger = null;
	}
	
	public String name(){
		return zName;
	}
	
	public Schueler nachfolger(){
		return zNachfolger;
	}
	
	public void setzeNachfolger(Schueler pNachfolger){
		zNachfolger = pNachfolger;
	}
	
}
