package s1;

public class Stack {

	private Person last;
	
	public Stack() {
		last = null;
	}
	
	
	public void add(Person pPerson) {
		if(empty()) {
			last = pPerson;
		}else {
			pPerson.setnext(last);
			last = pPerson;
		}
	}
	
	public boolean empty() {
		return last == null;
	}
	
	public Person showlast() {
		return last;
	}
	
	public void remove() {
		if(!empty()&&last.getnext()!=null) {
			last = last.getnext();
		}else {
			last = null;
		}
	}
	
	
}
