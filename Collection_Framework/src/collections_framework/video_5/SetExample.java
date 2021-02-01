package collections_framework.video_5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// Set accepts only unique value

		// HashSet doesnot retain insertion order.
//		Set<String> set1 = new HashSet<String>();

		// LinkedHashSet maintains insertion order
//		Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet orders elements in natural order
		Set<String> set1 = new TreeSet<String>();

		if (set1.isEmpty()) {
			System.out.println("Set is empty");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("camel");
		set1.add("bear");

		// Adding duplicate value
		set1.add("mouse");

		System.out.println(set1);

		if (set1.isEmpty()) {
			System.out.println("Set is empty");
		}
		/// iterate through set ///

		for (String element : set1) {
			System.out.println(element);
		}
		// does set contain a particular item

		if (set1.contains("penguin")) {
			System.out.println("Contains penguin");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat");
		}

		
		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");

		// Intersection of SET
		Set<String> intersection = new HashSet<String>(set1);
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		
		// Difference of SET
		Set<String> difference =  new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
