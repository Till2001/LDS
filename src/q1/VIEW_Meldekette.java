package q1;

import basiX.*;

public class VIEW_Meldekette {
	// Deklaration
	private Fenster fenster;

	private TextFeld tfEingabe, tfDelEingabe;

	private Knopf kNaechsterSchueler,kListealleschueler,kEntferneschueler;

	private BeschriftungsFeld bAusgabe;
	
	private CONTROLLER_Meldekette c;

	// Konstruktor
	public VIEW_Meldekette() {
		fenster = new Fenster("Meldekette by T.W.", 860, 600); 
		fenster.setzeHintergrundFarbe(Farbe.rgb(240, 240, 240));
		
		
		
		tfEingabe = new TextFeld(20, 20, 260, 40);
		tfEingabe.setzeSchriftGroesse(20);
		tfEingabe.setzeFokus();
		tfEingabe.setzeHintergrundFarbe(Farbe.rgb(255, 255, 255));
//		tfEingabe.setzeTextFeldLauscher(new TextFeldLauscher() {
//
//			
//			@Override
//			public void bearbeiteTextVeraenderung(TextFeld t) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void bearbeiteReturnGedrueckt(TextFeld t) {
//				c.schuelerMeldetSich(t.text());
//				t.setzeText("");
//				t.setzeFokus();
//				c.naechsterSchueler();
//				tfEingabe.setzeFokus();
//
//			}
//
//			@Override
//			public void bearbeiteFokusVerloren(TextFeld t) {
//				// TODO Auto-generated method stub
//
//			}
//		});
		
		tfDelEingabe = new TextFeld(580,20,260,40);
		tfDelEingabe.setzeSchriftGroesse(20);
		
		
		bAusgabe = new BeschriftungsFeld(null, 20,180,260,40);
		bAusgabe.setzeSchriftGroesse(18);
		bAusgabe.setzeText("Unterrichtsbeginn");
		
		
		kNaechsterSchueler = new Knopf("Schüler Hinzufügen", 20, 100, 260, 40);
		kNaechsterSchueler.setzeKnopfLauscher(new KnopfLauscher() {

			@Override
			public void bearbeiteKnopfDruck(Knopf k) {
//				c.naechsterSchueler();
//				tfEingabe.setzeFokus();
				c.schuelerMeldetSich(tfEingabe.text());
				tfEingabe.setzeText("");
				tfEingabe.setzeFokus();
			}
		});
		
		
		kListealleschueler = new Knopf("Liste Aller Schüler die sich melden",300,100,260,40);
		kListealleschueler.setzeKnopfLauscher(new KnopfLauscher() {
			
			@Override
			public void bearbeiteKnopfDruck(Knopf k) {
//				setzeText(c.list());
				Dialog.info("", c.list());
			}
		});
		
		
		kEntferneschueler = new Knopf("Entferne Schüler",580,100,260,40);
		kEntferneschueler.setzeKnopfLauscher(new KnopfLauscher() {
			
			@Override
			public void bearbeiteKnopfDruck(Knopf k) {
				c.entferne(tfDelEingabe.text());
//				tfDelEingabe.setzeText("");
			}
		});
		
		c = new CONTROLLER_Meldekette(this);

	} // Ende Konstruktor

	

	public void setzeText(String string) {
		bAusgabe.setzeText(string);
	}

	

}// Ende Klasse
