package q1;

public class Schlange {

	private Schueler kenntErsten, kenntLetzten;
	
	public Schlange(){
		kenntErsten = kenntLetzten = null;
	}
	
	public void fuegeEin(Schueler pSchueler) {
		if(this.istLeer()){
			kenntErsten=kenntLetzten=pSchueler;
		}else{
			kenntLetzten.setzeNachfolger(pSchueler);
			kenntLetzten=pSchueler;
		}
		
	}

	public boolean istLeer() {
		
		return kenntErsten==null&&kenntLetzten==null;
	}

	public Schueler zeigeErsten() {
		return kenntErsten;
		}
	
		
	

	public void entferne() {
		if(!this.istLeer()&&kenntErsten.nachfolger()!=null){
			kenntErsten=kenntErsten.nachfolger();
			
		}else{
			kenntErsten=kenntLetzten=null;
		}
		
	}

}
