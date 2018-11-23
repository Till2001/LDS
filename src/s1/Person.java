package s1;

public class Person {

	private String name;
	private Person next;
	
	public Person(String pName) {
		name = pName;
		next = null;
	}
	
	
	public String getname(){
		return name;
	}
	
	public void setname(String pName) {
		name = pName;
	}
	
	public void setnext(Person pPerson) {
		next = pPerson;
	}
	
	public Person getnext() {
		return next;
	}
}
