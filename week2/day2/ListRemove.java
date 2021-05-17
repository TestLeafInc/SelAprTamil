package week2.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListRemove {

	public static void main(String[] args) {

		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		
		Set<Integer> unique = new HashSet<Integer>();
		List<Integer> dups = new ArrayList<Integer>();
		
		for (Integer everyElement : dups) {
			if(!unique.add(everyElement)) {
				dups.add(everyElement);
			}
		}
		System.out.println(dups);
	}

}
