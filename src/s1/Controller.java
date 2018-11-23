package s1;

import basiX.Dialog;

public class Controller {

	private Stack stack;
	
	public Controller() {
		stack = new Stack();
		int x = Dialog.eingabeINT("Eingabe", "Wieviele Leute möchten sie dem Stapel hinzufügen?");
		for(int i = 0;i<x;i++) {
//			String pName = Dialog.eingabe("Eingabe", "Name?");
//			Person pPerson = new Person(pName);
			stack.add(new Person(Dialog.eingabe("Eingabe", "Name?")));
			
		}
		while(!stack.empty()) {
			Dialog.info("Ausgabe", stack.showlast().getname());
			stack.remove();
		}
	}
	
	public static void main(String[] args) {
		Controller c;
		c = new Controller();
		

	}

}
