package oui;

public class Classroom {
	
	public static void main(String... args) {
		
		Wilder Henri = new Wilder("Henri", true);
		Wilder JeanJean = new Wilder("JeanJean" , false);
		
		System.out.println(Henri.whoAmI());
		System.out.println(JeanJean.whoAmI());
	
	}
	
	

}
