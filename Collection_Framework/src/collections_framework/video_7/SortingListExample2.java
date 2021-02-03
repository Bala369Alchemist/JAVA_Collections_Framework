package collections_framework.video_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
}

public class SortingListExample2 {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(3, "Charan"));
		people.add(new Person(2, "Bhuvan"));
		people.add(new Person(5, "Deepak"));
		people.add(new Person(1, "Ashok"));
		people.add(new Person(4, "Chethan"));
		
		// Sorting in order of Id
//		Collections.sort(people , new Comparator<Person>() {
//
//			@Override
//			public int compare(Person p1, Person p2) {
//				if(p1.getId() > p2.getId()) {
//					return 1;
//				}else if(p1.getId() < p2.getId()) {
//					return -1;
//				}
//				return 0;
//			}
//		});
		
		
		
		// Sorting in Alphabetical order of Name of person
		Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return (p1.getName()).compareTo((p2.getName()));
			}
		});
		
		for(Person person : people) {
			System.out.println(person);
		}
		
	}

}
