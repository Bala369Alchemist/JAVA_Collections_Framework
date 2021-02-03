package collections_framework.video_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}

// getting elements in alphabetical order (same as Collections.sort())
class AlphabeticalComaparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return s1.compareTo(s2);// aplahbetical order (natural order)

	}
}

// getting String elements in reverse alphabetical order
class ReverseAlphabeticalComaparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		return -s1.compareTo(s2);//reverse aplahbetical order (natural order)

	}
}

public class SortingList {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("chicken");
		animals.add("elephant");
		animals.add("zebra");
		animals.add("cat");
		animals.add("monkey");
		animals.add("cow");
		animals.add("tiger");

		// using sort method to sort the ArrayList (String) [ method 1 ]
//		Collections.sort(animals, new StringLengthComparator());

		// calling AlpahbeticalComparator to sort the string elements in natural order [ method 2]
//		Collections.sort(animals, new AlphabeticalComaparator());
		
		// calling ReverseAlphabeticalComparator to sort the elements in reverse order
		Collections.sort(animals, new ReverseAlphabeticalComaparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		// using sort method to sort the ArrayList (String)
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(21);
		numbers.add(36);
		numbers.add(73);
		numbers.add(71);
		numbers.add(14);
		numbers.add(1);

		//sorting numbers in natural order
//		Collections.sort(numbers);
		
		
		// sorting numbers in reverse order
		Collections.sort(numbers , new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				
				return -num1.compareTo(num2);
			}
		});

		for (Integer number : numbers) {
			System.out.println(number);
		}
	}

}
