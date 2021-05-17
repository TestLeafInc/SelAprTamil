package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class LearnMap {

	public static void main(String[] args) {
		
		/*
		 * Map -> Interface
		 * Key Can not allow duplicates (Only unique)
		 * Whereas Value can be duplicate
		 * Multi Dimensional -> Dynamic Array
		 * Implementation Class: 1) HashMap 2)LinkedHashMap 3)TreeMap
		 * 
		 * HashMap -> Hashing Algorithm -> Fastest -> Random (Hashed Order)
		 * LinkedHashMap -> Maintains the insertion order 
		 * TreeMap -> Comparator Algorithm -> ASCII order 
		 * 
		 * Key-value pair : Entry
		 * 
		 * Methods:
		 * 
		 * 1) put -> adds key with the value to the map   
		 * 2) remove -> remove by key 
		 * 3) size -> count of entries 
		 * 4) containsKey -> confirm if the key exist in the map
		 * 5) clear -> delete all entries in the map
		 * 6) isEmpty -> confirms if the map is empty
		 * 7) get -> return the value of the key
		 * 
		 * Car Model, Car Price
		 * 
		 */
		
		Map<String, Integer> carEntries = new HashMap<String, Integer>();
		carEntries.put("Swift", 7800000);
		carEntries.put("EcoSport", 1080000);
		carEntries.put("City", 1300200);
		carEntries.put("Baleno", 1400200);
		carEntries.put("Venue", 7800000);

		
		//carEntries.remove("City");
		System.out.println(carEntries.size());
		System.out.println(carEntries.get("EcoSport"));
		System.out.println(carEntries.containsKey("BMW 500S"));
		carEntries.put("Swift", 8200000);
		carEntries.put("Swift", 7600000);

		System.out.println(carEntries.get("Swift"));
		
		
		for (Entry<String, Integer> entry : carEntries.entrySet()) {
			//System.out.println(entry);
			System.out.println(entry.getKey());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
