package trhekegmu;

import basiX.Dialog;

public class View {

	private Controller c;
	private String[] auswahlstrings;
	
	public View() {
		c = new Controller();
		Dialog.info("Info", "Bisher sind nur Aufgaben 1 2 3 und 4 implementiert");
		auswahlstrings = new String[6];
		auswahlstrings[0] = "A1";
		auswahlstrings[1] = "A2";
		auswahlstrings[2] = "A3";
		auswahlstrings[3] = "A4";
		auswahlstrings[4] = "A5";
		auswahlstrings[5] = "Ende";
		
		switch(Dialog.auswahl("Auswahl", auswahlstrings)) {
		case "A1":
			c.A1();
			break;
		case "A2":
			c.A2();
			break;
		case "A3":
			c.A3Eingabe();
			break;
		case "A4":
			String tmp = Dialog.eingabe("Eingabe", "Welches Wort soll getestet werden?"+"\n"+"Groß und klein Schreibung wird beachtet!");
			if(c.paltest(tmp)) {
				Dialog.info("Ausgabe", tmp+" ist ein Pallindrom");
			}else {
				Dialog.info("Ausgabe", tmp+" ist kein Pallindrom");
			}
			break;
		case "A5":
			Dialog.info("Info", "Noch nicht implementiert");
			break;
		case "Ende":
			Dialog.info("Info", "und tüss");
			System.exit(0);
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		View v = new View();

	}

}
