package collections_framework.video_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2) {
			return 1;
		}else if( len1 < len2) {
			return -1;
		}
		return 0;
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

		// using sort method to sort the ArrayList (String)
		Collections.sort(animals , new StringLengthComparator());
		
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		
		// using sort method to sort the ArrayList (String) 
		List<Integer> numbers  = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(21);
		numbers.add(36);
		numbers.add(73);
		numbers.add(71);
		numbers.add(14);
		numbers.add(1);
		
		Collections.sort(numbers);
		
		for(Integer number : numbers) {
			System.out.println(number);
		}
	}

}
