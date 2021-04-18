package week1.day2;

import java.util.Iterator;

public class ReverseString {
	
	/*
	 * Reverse a String
	 * 
	 * Input: tester
	 * Output: retset
	 * 
	 * Psuedocode
	 * 
	 * 1) String -> Character Array
	 * 2) for loop reverse direction
	 * 3) syso print character index
	 * 
	 * 
	 */

	public static void main(String[] args) {
	
		String data = "tester";
		/*char[] charArray = data.toCharArray();
		
		for (int i = charArray.length-1; i >= 0; i--) {
			System.out.print(charArray[i]);
		} */
		
		for (int i = data.length()-1; i >= 0; i--) {
			System.out.print(data.charAt(i));
		}

	}

}
