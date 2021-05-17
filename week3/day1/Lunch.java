package week3.day1;

public class Lunch {
	
	/*
	 * Method Overloading
	 * 
	 * - This is static polymorphism where there could
	 * 	 multiple methods with same signature but with 
	 * - differ arguments either with 
	 * 			- different number of arguments or with
	 * 			- type of arguments
	 * 
	 */

	// zero input argument
	public void carryLunch() {
		System.out.println("I will take 2+1 lunch box");
	}

	// 1 argument 
	public void carryLunch(String occassion) {
		if(occassion.equalsIgnoreCase("pot luck")) {
			System.out.println("I will carry Briyani for 10 people");
		} else {
			System.out.println("Just carry fruits just for me");
		}
	}

	// 1 argument 
	public void carryLunch(int number) {
		if(number <=10 ) {
			System.out.println("I will carry Briyani for 10 people");
		} else {
			System.out.println("Just carry fruits just for me");
		}
	}

	// 2 arguments

	public void carryLunch(String occassion, int number) {
		if(occassion.equalsIgnoreCase("pot luck") && number > 10) {
			System.out.println("I have to order from swiggy");
		} else if(occassion.equalsIgnoreCase("pot luck") && number <= 10) {
			System.out.println("I will take briyani with me");
		} else {
			System.out.println("Just carry fruits just for me");
		}
	}


}
