package week1.day2;

public class FindOccurances {

	/*
	 * Problem Statement : Find the number of occurance of given character
	 * 
	 * Input: "testleaf"  'e' -> 
	 * output: 2 
	 * 
	 * Logic
	 * 
	 * 1) String to character array
	 * 2) Loop through every character
	 * 3) Check if that character matches the input character
	 * 4) Match -> increment count
	 * 
	 * 5) final, print the count !!
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String input = "testleaf";
		char search = 'a';
		int count = 0;
		
		// 1) String to character array
		char[] characters = input.toCharArray();
		
		for (int i = 0; i < characters.length; i++) {
			if(characters[i] ==  search) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}












