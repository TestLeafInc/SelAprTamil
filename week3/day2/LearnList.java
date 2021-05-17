package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		/*
		 * List -> Interface
		 * Can allow duplicates
		 * Single Dimensional -> Dynamic Array
		 * Implementation Class: ArrayList, LinkedList
		 * 
		 * ArrayList -> Index based algorithm (0 -> n)
		 * LinkedList -> Node based algorithm (Prev, Next)
		 * 
		 * Methods:
		 * 
		 * 1) add -> adds an item to the list (at the end by default or by index)  
		 * 2) remove -> remove by object (value) / index 
		 * 3) size -> count of items 
		 * 4) contains -> confirm if the element exist in the list
		 * 5) clear -> delete all items in the list
		 * 6) isEmpty -> confirms if the list is empty
		 * 7) get -> returns the element in the given index 
		 */
		
		
		List<String> lst = new ArrayList<String>();
		lst.add("Anbu");
		lst.add("Vishalakshi");
		lst.add("Bhuvana");
		lst.add("Gayathri");
		lst.add("Hussain");
		
		
		lst.add("Babu");
		
		lst.add("Mari");
		lst.add("Babu");
		lst.add(1, "SSP"); // if you use this method, it will change all the index at worse case
		
		//lst.remove(6); 
		lst.remove("Babu");
		
		System.out.println(lst.contains("babu"));
		//lst.clear();
		System.out.println(lst.get(1));
		
		System.out.println(lst.size());
		
		// List does not sort by itself !!
		// Collection -> Interface, Collections -> Class
		Collections.sort(lst);
		System.out.println(lst);
		

	}

}
