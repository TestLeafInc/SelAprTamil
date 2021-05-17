package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {
	
	/*
	 * 
	 * Problem:
	 * 
	 * Find the most duplicate number -> First most duplicate
	 * 
	 * input: hello
	 * ouput: l
	 * 
	 * input: abbaba
	 * output: b
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * 1) Map -> HashMap 
	 * 2) String -> ch[] -> Get all the character -> occurance
	 * 3) Keep comparing the occurance with other values -> max value -> character
	 * 
	 */
	
	public static void main(String[] args) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String input = "abbaba";
		char maxOccurance = input.charAt(0);
		int maxValue = 0;
		
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			map.put(charArray[i], map.getOrDefault(charArray[i], 0)+1);
			if(map.get(charArray[i]) > maxValue) {
				maxOccurance = charArray[i];
				maxValue = map.get(charArray[i]);
			}
			
		}
		System.out.println(maxOccurance);
		
	}

}






