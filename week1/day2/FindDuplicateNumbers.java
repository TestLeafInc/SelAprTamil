package week1.day2;

import java.util.Arrays;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		
		int[] input = {23, 36, 23, 45, 67, 26, 45, 41, 36};
		// 23, 23, 26, 36, 36, 41, 45, 45, 67
		
		/* Approach - 1
		for (int i = 0; i < input.length; i++) {
			for (int j = i+1; j < input.length; j++) {
				if(input[i] == input[j]) {
					System.out.println(input[i]);
				}
			}
		}
		*/
		
		// Sort the array
		Arrays.sort(input);
		for (int i = 0; i < input.length-1; i++) {
			if(input[i] == input[i+1]) {
				System.out.println(input[i]);
			}
		}

	}

}
