package collections_framework.video_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// creating ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// adding elements to ArrayList
		numbers.add(5);
		numbers.add(10);
		numbers.add(20);
		numbers.add(40);

		// getting element from array list by using index
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(1));

		System.out.println();
		System.out.println("Elements of Array List by using for loop");

		// getting elements from ArrayList using for loop
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		// code to remove elements from Array List
		numbers.remove(numbers.size() - 1);

		// code to remove first element from Array List
		numbers.remove(0);

		System.out.println();
		System.out.println("Elements of Array List by using for each loop");

		for (Integer value : numbers) {
			System.out.println(value);
		}

		// List interface ..
		List<String> strings = new ArrayList<String>();
	}
}
