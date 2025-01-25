package demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
					colors = new TreeSet<String>();
					colors = new LinkedHashSet<String>();
					
		/*
		 * size()
		 * add()
		 * remove()
		*/
		
		
		// Add elements to the Set
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Green"); // Duplicate element will not be added

		// Check the size of the Set
		System.out.println("Number of colors: " + colors.size()); // Output: 3
 
		// Iterate through the set using a for-each loop
		for (String color : colors) {
			System.out.println(color);
		}

		// Remove an element
		colors.remove("Green");
		
		System.out.println("After removing Green:");
		for (String color : colors) {
			System.out.println(color);
		}
	}
}
