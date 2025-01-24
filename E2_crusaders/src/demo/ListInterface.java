//package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListInterface {
	public static void main(String[] args) {
		List<Object> fruits = new ArrayList<Object>();
		fruits = new Vector<Object>();

		/*
		 * get()
		 * add()
		 * remove()
		*/

		// Add elements to the List
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add(123); // Duplicate element is allowed

		// Access elements by index
		System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

		// Iterate through the list using a for-each loop
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}

		// Remove an element
		fruits.remove("Banana");

		System.out.println("After removing Banana:");
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
