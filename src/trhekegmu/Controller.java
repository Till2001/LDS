package trhekegmu;

import basiX.Dialog;
import basiX.Hilfe;
import trhekegmu.coins.*;

public class Controller {

	private Queue<Integer> q;
	private Stack<Integer> s;
	private String string;
	private Stack<Coin>	sc;
	private int v1,v2,v3,v4,v5;
	
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
		integerstackausgabe(s);
		
	}
	
	
	public void A2() {
		int x = 20;
		for(int i = 0;x>i;x--) {
			switch(Hilfe.zufall(0, 4)) {
			case 0:
				sc.push(new Coin10());
				break;
			case 1:
				sc.push(new Coin20());
				break;
			case 2:
				sc.push(new Coin50());
				break;
			case 3:
				sc.push(new Coin100());
				break;
			case 4:
				sc.push(new Coin200());
				break;
			}
		}

		
		
		for(int i = 20;i>0;i--) {
			switch(sc.top().getDenom()) {
			case 10:
				v1++;
				break;
			case 20:
				v2++;
				break;
			case 50: 
				v3++;
				break;
			case 100:
				v4++;
				break;
			case 200:
				v5++;
				break;
			}
			sc.pop();
		}
		
		v1 = v1*10;
		v2 = v2*20;
		v3 = v3+50;
		v4 = v4*100;
		v5 = v5*200;

		double va = v1+v2+v3+v4+v5;
		va = va/100;
		Dialog.info("Ausgabe", "Der Münzstapel ist "+va+"€ wert");
		
	}
	

	


	public void integerstackausgabe(Stack<Integer> pS) { //Stack Ausgeben
		
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
