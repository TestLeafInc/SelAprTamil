package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		/*
		 * Set -> Interface
		 * Can not allow duplicates (Only unique)
		 * Single Dimensional -> Dynamic Array
		 * Implementation Class: 1) HashSet 2)LinkedHashSet 3)TreeSet
		 * 
		 * HashSet -> Hashing Algorithm -> Fastest -> Random (Hashed Order)
		 * LinkedHashSet -> Maintains the insertion order 
		 * TreeSet -> Comparator Algorithm -> ASCII order 
		 * 
		 * Methods:
		 * 
		 * 1) add -> adds an item to the list (at the end by default)  
		 * 2) remove -> remove by object (value) / index 
		 * 3) size -> count of items 
		 * 4) contains -> confirm if the element exist in the list
		 * 5) clear -> delete all items in the list
		 * 6) isEmpty -> confirms if the list is empty
		 * 
		 */
		
		
		Set<String> companies = new TreeSet<String>();
		companies.add("Syntel");
		companies.add("HCL");
		companies.add("MI");
		boolean add = companies.add("HP");
		System.out.println(add);
		companies.add("TL");
		boolean add2 = companies.add("HP");
		System.out.println(add2);
		companies.add("ITO");
		
		System.out.println(companies.size());
		System.out.println(companies);
		

	}

}
