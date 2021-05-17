package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters {
	
	/*
	 * Problem
	 * 
	 * 1) Take your name as input
	 * 2) Print all unique characters only (any order)
	 * 
	 * Input:  babu
	 * Output: a u 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * 1) Convert String to Character array
	 * 2) Create a new Set -> HashSet
	 * 3) Add each character to the Set and if it is already there, remove it
	 * 4) Finally, print the set
	 * 
	 */
	
	
	// b a b u
	// a u
	
	public static void main(String[] args) {
		
		String input = "babub";
		Set<Character> unique = new HashSet<Character>();
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(!unique.add(charArray[i])) {
				unique.remove(charArray[i]);
			}
		}
		
		System.out.println(unique);
		
	}

}
