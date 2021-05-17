package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumbersOccurances {

	/*
	 * Input array numbers, each occurances
	 * 
	 * input: {2,3,5,6,3,2,1,4,2,1,6,-1};
	 * output: 2 -> 3 , 3 -> 2, 4 -> 1 
	 * 
	 * Order: Ascending Order
	 * 
	 */
	
	/*
	 * Psuedcode:
	 * 
	 * 1) Create Map -> TreeMap
	 * 2) For loop -> each number -> add to the map
	 * 3) If it is exist -> update it with + 1
	 * 	  Else -> new entry with 1 as value
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] data = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < data.length; i++) {
			map.put(data[i], map.getOrDefault(data[i], 0)+1);
		}
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
