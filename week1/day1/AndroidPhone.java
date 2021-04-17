package week1.day1;

public class AndroidPhone {
	
	/*
	 * Behaviours / Actions / verification -> method in Java
	 * 
	 * Noun + Verb
	 * 
	 * browseInternet
	 * chatInWhatsapp
	 * playGames
	 * makeVideoCall
	 * takeSelfie
	 * makePayment
	 * sendSMS
	 * 
	 * Method Signature:
	 * 
	 * 1) access modifier    		-> Who can access?
	 * 2) return type (output)		-> output sent by the method
	 * 3) method name (unique)		-> name of the method
	 * 4) input arguments (input)	-> what input should i provide when calling method?
	 * 
	 * 1) Method Access Modifier
	 * 
	 * a) public 			-> Anyone can access
	 * b) private			-> Only members of the class can access (methods within same class)
	 * c) protected			-> Only can be accessed from same package + inherited classes
	 * d) default / package -> Only classes that are from same package 
	 * 
	 * Facebook -> 
	 * public  (your name)
	 * private (phone number, activity logs)
	 * protected (posts, photos)
	 * group / package (group specific photos, posts)
	 * 
	 * Apartment -> 
	 * public 	-> main gate, visitor area
	 * private  -> your car, parking area, home
	 * protected -> items within the house, gym, lift
	 * default -> swimming pool, park, theater
	 * 
	 * 2) Return Type (Cannot be more than one)
	 * 
	 * primitive data type or non-primitive data type (Class) or void (no return) !!
	 * 
	 * 2 numbers add (18, 24) -> int
	 * what's your name -> String 
	 * did you had your food? -> boolean
	 * what's your bank balance -> float / double
	 * what's your age -> short 
	 * please respond -> void 
	 * 
	 * 3) Name of the method -> keep it meaningful -> starts with lowercase 
	 * + following word with uppercase
	 * 
	 * 4) Input arguments (zero or more) Best practice: not more than 3 
	 * multiply -> 2 (int,double)
	 * a) Number of inputs
	 * b) Data type of the input 
	 * 
	 */
	
	
	// Switch On or Off
	public void switchOnOff(boolean bOff) {
		// logic 
		if(bOff) {
			System.out.println("The phone is switched OFF");
		} else {
			System.out.println("The phone is switched ON");
		}
	}
	
	public String getPhoneBrand(String phoneType) {
		if(phoneType.equals("Android"))
			return "One Plus 7TPro";
		else
			return "iPhone 6S";
	}
	// Brand -> One Plus 7 
	// String -> compare -> .equals()
	// Non String -> == 
	
	
	private short getBatteryPercentage() {
		return 45;
	}
	
	// entry point
	public static void main(String[] args) {
		
		// How to call a method from a main method
		// Step1) Create a object of the class
		// ClassName ref = new ClassName();
		AndroidPhone phone = new AndroidPhone();
		
		// Call using that reference
		// Step2) ref.methodName();
		String ph = phone.getPhoneBrand("Android");
		System.out.println(ph);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
