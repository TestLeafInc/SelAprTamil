package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		
		// We cannot create object for the interface. 
		// AndroidDesign phone = new AndroidDesign();
		Samsung phone = new Samsung();
		//phone.
		
		// Other alternative
		AndroidDesign ph = new Samsung();

		// Other
		SamsungDesign ph1 = new Samsung();
		
	}

}
