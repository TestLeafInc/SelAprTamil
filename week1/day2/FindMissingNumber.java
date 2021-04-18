package week1.day2;

import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] nums = {8,7,6,3,5,4,11,9};
		
		// Easy Understand -> 3,4,5,6,7,8,9,11
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]+1  != nums[i+1]) {
				System.out.println(nums[i]+1);
				break;
			}
		}

	}

}
