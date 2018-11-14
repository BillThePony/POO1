package oui;

public class Wilder {
	
	String firstName;
	boolean aware;
	
	public Wilder(String firstName , boolean aware) {
		
		this.firstName = firstName;
		this.aware = aware;
	}
	
	public String getfirstName() {
		
		return this.firstName;
	}
	
	public boolean isaware() {
		
		return this.aware;
	}
	
	public void setfirstName(String firstName) {
		
		this.firstName = firstName;
	
	}
	
	public void setaware(boolean aware) {
		
		this.aware = aware;
	}
	
	public String whoAmI() {
		
		String sentence1 = " et je suis aware";
		String sentence2 = " et je ne suis pas aware";
		
		if(this.aware == true) {
			return ("Je m'appelle " + firstName + sentence1);
		}
		
		else {
			return ("Je m'appelle " + firstName + sentence2);
		}
	}

}
