package trhekegmu;

import basiX.Dialog;
import trhekegmu.coins.*;

public class Controller {

	private Queue<Integer> q;
	private Stack<Integer> s;
	private String string;
	private Stack<Coin>	sc;

	
	public Controller() {
		q = new Queue<>();
		s = new Stack<>();
		sc = new Stack<>();
		
		
	}
	
	
	public void A1(){
		// Aufgabe A1
		int x = Dialog.eingabeINT("Eingabe", "Wieviele Zahlen möchten sie in die Queue einfügen?");
		for(int i = 0;i<x;i++) {
			int t = i+1;
			q.enqueue(Dialog.eingabeINT("Eingabe", "Geben sie die "+t+" Zahl ein."));
		}
		convertqs(q, s);
		stackausgabe(s);
		
	}
	
	
	public void stackausgabe(Stack<Integer> pS) { //Stack Ausgeben
		
		while(!pS.isEmpty()){
			Dialog.info("Ausgabe", ""+pS.top());
			pS.pop();
		}
	}
	
	public void convertqs(Queue<Integer> pQ,Stack<Integer> pS) { //Origin -> Target Q->S
		while(!pQ.isEmpty()) {
			pS.push(pQ.front());
			pQ.dequeue();
		}
	}
}
