package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingNumber {

	/*
	 * Problem 
	 * 
	 * There will be running number between 1 to 10
	 * One of the unique number will be missing
	 * Find the missing number
	 * 
	 * 
	 */
	
	/*
	 * Psuedocode
	 * 
	 * 1) Remove the duplicates using Set
	 * 2) Make sure the set is in the ascending order
	 * 3) Iterate from the starting number and verify the next number is + 1
	 * 4) If did not match, that is the number
	 * 
	 */
	
	public static void main(String[] args) {

		int[] numbers = {4,6,7,2,3,1,9,10,8,8,6};
		
		// 1) Remove the duplicates using Set
		Set<Integer> uniqueNumbers = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			uniqueNumbers.add(numbers[i]);
		}
		
		// 2) Convert Set to List 
		List<Integer> allNumbers = new ArrayList<Integer>(uniqueNumbers);
		for (int i = 1; i <= allNumbers.size(); i++) {
			if(i != allNumbers.get(i-1)) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
