package trhekegmu;

import basiX.Dialog;
import basiX.Hilfe;
import trhekegmu.coins.*;

public class Controller {

	private Queue<Integer> q;
	private Stack<Integer> s,t,r;
	private Stack<Coin>	sc;
	private int v1,v2,v3,v4,v5;
	private String teststring;
	public Controller() {
		q = new Queue<>();
		s = new Stack<>();
		r = new Stack<>();
		t = new Stack<>();
		sc = new Stack<>();
		teststring = "";
		
		
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
	
	public void convertqs(Queue<Integer> pQ,Stack<Integer> pS) { //Converts Q->S
		while(!pQ.isEmpty()) {
			pS.push(pQ.front());
			pQ.dequeue();
		}
	}
	
	
	public boolean paltest(String pS) {
		
		
		for(int i = pS.length();i>0;i--) {
			teststring = teststring+pS.charAt(i-1);
		}
		return pS.equals(teststring);
		
		
		
		
	}
	
	public void A3Eingabe() {
		int x = Dialog.eingabeINT("Eingabe", "Wie Lang ist die Reihe / Wie hoch ist der Turm");
		for(int i = 0;i<x;i++) {
			t.push(Dialog.eingabeINT("Eingabe", "Liegt ein Kleiner oder Großer Teller vor?"+"\n"+"Es wird von unten nach oben eingegeben."+"\n"+"1 = Kleiner Teller | 2 = Großer Teller"));
		}
		for(int i = 0;i<x;i++) {
			r.push(Dialog.eingabeINT("Eingabe", "Liegt ein Kleiner oder Großer Bieber vor?"+"\n"+"Es wird von hinten nach vorne eingegeben."+"\n"+"1 = Kleiner Bieber | 2 = Großer Bieber"));
		}
		if(A3Compare(r, t)) {
			Dialog.info("Ausgabe", "Die Reihe passt zu dem Turm.");
		}else {
			Dialog.info("Ausgabe", "Die Reihe passt nicht zum Turm.");
		}
	}
	
	public boolean A3Compare(Stack<Integer> pR,Stack<Integer> pT) {
		while(!pR.isEmpty()||!pT.isEmpty()) {
			if(pR.top().equals(pT.top())) {
				pR.pop();
				pT.pop();
			}else {
				return false;
			}
		}
		return true;
	}	
	
	
}
