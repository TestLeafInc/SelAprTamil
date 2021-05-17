package week3.day2;

import java.util.HashMap;
import java.util.Map;

public class FindAllOccurances {
	
	/*
	 * Given String as input, find all occurances of each characters
	 * 
	 * Input: babu
	 * Output: b -> 2, a -> 1, u -> 1
	 * 
	 * 
	 * b a b u
	 * 
	 * b -> 1+1
	 * a -> 1
	 * 
	 * 
	 * Input: amazon
	 * Output: a -> 2 m -> 1 z -> 1 o -> 1 n -> 1
	 * 
	 */
	
	/*
	 * Psuedocode:
	 * 
	 * 1) Convert String -> Chracter Array
	 * 2) Push each character to the map 
	 * 		a) If already exist (character) -> get the value and update with +1 
	 * 		b) If it is does not exist (character as key) -> create an entry (ch, 1)
	 * 
	 */

	public static void main(String[] args) {
		String name = "babu";
		char[] charArray = name.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) { // existing key
				Integer value = map.get(charArray[i]);
				int newValue = value+1;
				map.put(charArray[i],newValue);
			}else { // it is new entry
				map.put(charArray[i],1);
			}
		}
		System.out.println(map);
	}

}











