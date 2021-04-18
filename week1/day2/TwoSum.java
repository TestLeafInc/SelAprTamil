package week1.day2;

public class TwoSum {

	public static void main(String[] args) {
	
		int[] input = {2,3,4,5};
		int k = 19;
		boolean bMatch = false;
		
		/*
		 * first loop 0 to last but 1
		 * next loop i+1 to last but 1
		 * first + second == k => got it !! 
		 * else continue
		 * 
		 */
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i]+ input[j] == k) {
					bMatch = true;
					System.out.println("True");
					break;
				}
			}
			if(bMatch)
				break;
		}
		
		if(!bMatch)
			System.out.println("False");
		

	}

}
