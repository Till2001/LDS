package trhekegmu;

import basiX.Dialog;

public class View {

	private Controller c;
	private String[] auswahlstrings;
	
	public View() {
		c = new Controller();
		
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
			
			break;
		case "A3":
			break;
		case "A4":
			break;
		case "A5":
			break;
		case "Ende":
			Dialog.info("Info", "und tüss");
			System.exit(0);
			break;
		}
		
	}
	
	
	public static void main(String[] args) {
		View v;
		v = new View();
	}

}
