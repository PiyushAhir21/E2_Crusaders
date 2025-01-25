package demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionList {

	public static void main(String[] args) {
		Set<String> students = new HashSet<String>();
					students = new TreeSet<String>();
					students = new LinkedHashSet<String>();

//		students.add("Aditya");
		students.add("Utkarsh");
		students.add("Shivani");
		students.add("Anurag");
		students.add("Sunita");

		int numbers = students.size();
		System.out.println(numbers);
		
		for (String stud : students) {
			System.out.println(stud);
		}
		
		System.out.println();
		
		students.remove("Utkarsh");
		for (String stud : students) {
			System.out.println(stud);
		}
		
		List<String> trainers = new ArrayList<String>();
		trainers.add("Priya ma'am");
		trainers.add("Shambhu sir");
		trainers.add("Akash sir");
		trainers.add("Jitesh sir");
		trainers.add("Deepak sir");
		
		System.out.println();
		
		System.out.println("Output is : " + trainers.get(4));
		
		trainers.remove(3);
		
		System.out.println();
		for (String train : trainers) {
			System.out.println(train);
		}
		
	}

}
