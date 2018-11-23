package q1;

import basiX.Dialog;

public class CONTROLLER_Meldekette {
	private Schlange schlange;
	private VIEW_Meldekette myView;
	
	public CONTROLLER_Meldekette(VIEW_Meldekette pView){
		schlange = new Schlange();
		myView=pView;
	}

	public void schuelerMeldetSich(String pName) {
		Schueler lSchueler = new Schueler(pName);
		schlange.fuegeEin(lSchueler);
		
	}

	public void naechsterSchueler() {
		if (!schlange.istLeer()) {
			myView.setzeText(schlange.zeigeErsten().name() + " ist dran!");
			schlange.entferne();
		}else{
			myView.setzeText("Es hat sich keiner gemeldet!");
		}
		
	}

	public String list() {
		if(schlange.istLeer()) {
			return "Es meldet sich Keiner";
		}
		int i = 0;
		String s = "";
		Schueler pSchueler = schlange.zeigeErsten();
		while(pSchueler!=null) {
			s = s+"\n"+pSchueler.name();
			i++;
			pSchueler = pSchueler.nachfolger();
		}
		s = "Es meldet/melden sich "+i+" Schüler :"+" \n"+s;
		return s;

	}

	public void entferne(String pString) {
		Schueler pSchueler = schlange.zeigeErsten();
		while(pSchueler.nachfolger()!=null) {
			if(pSchueler.nachfolger().name().equals(pString)) {
				pSchueler.setzeNachfolger(pSchueler.nachfolger().nachfolger());
				Dialog.info("", "1");
			}
			pSchueler = pSchueler.nachfolger();
			
		}
		
		
	}
	
	
}
