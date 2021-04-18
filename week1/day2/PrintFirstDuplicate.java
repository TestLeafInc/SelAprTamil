package week1.day2;

public class PrintFirstDuplicate {
	
	/*
	 * Problem Statement:
	 * 
	 * Given String, find the first duplicate character. If there is no duplicate, print as no dups found !
	 * 
	 * Example 1:
	 * 
	 * Input: "testleaf"
	 * Output: t
	 * 
	 * Example 2:
	 * 
	 * Input: "queen"
	 * Output: e
	 * 
	 * Example 3:
	 * 
	 * Input : helo
	 * Output: "No dups found"
	 * 
	 * Hint:
	 * 
	 * 1) String to character array
	 * 2) loop (outer) 0 -> length -1
	 * 3) loop (inner) i+1 -> length - 1
	 * 4) compare
	 * 5) if matches, print the character and break
	 * 6) print no dups !!
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		String name = "amma";
		char[] chars = name.toCharArray();
		boolean bFoundDuplicate = false;
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = i+1; j < chars.length; j++) {
				if(chars[i] == chars[j]) {
					System.out.println("This is duplicate :"+chars[i]);
					bFoundDuplicate = true;
					break;
				}
			}
			if(bFoundDuplicate)
				break;
		}
		
		if(!bFoundDuplicate)
			System.out.println("There is no dups in the given String");

	}

}
