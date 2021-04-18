package week1.day2;

import java.util.Iterator;

public class ReverseWord {
	
	/*
	 * Reverse a String
	 * 
	 * Input: tester
	 * Output: retset
	 * 
	 * Psuedocode
	 * 
	 * 1) String -> split words
	 * 2) for loop reverse direction
	 * 3) syso print word index
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		String data = "Today is a beautiful day";
		// day beautiful a is Today
	
		String[] words = data.split(" ");
		for (int i = words.length - 1; i >= 0 ; i--) {
			System.out.print(words[i]+" ");
		}
		
		
		
		
		
		
		

	}

}
