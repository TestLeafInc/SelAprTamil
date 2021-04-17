package week1.day1;

public class Bicycle {
	
	/*
	1. Create a new class Bicycle
	2. Create 2 methods by name 
	    1. getCycleColor -> String
	    2. isPuncture -> boolean 
	3.  Create a main method
	4.  And call both the method using object reference
	5. And print the values in the main method
	*/

	public static void main(String[] args) {
		Bicycle cycle = new Bicycle();
		boolean puncture = cycle.isPuncture();
		System.out.println(puncture);
		String cycleColor = cycle.getCycleColor();
		System.out.println(cycleColor);

	}
	
	public String getCycleColor() {
		return "black";
	}
	
	public boolean isPuncture() {
		return false;
	}

}
