package collections_framework.video_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map  = new HashMap<Integer,String>();
		
		// adding elements to hashmap
		map.put(5, "Five");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(7, "Seven");
		map.put(2, "Hello");
		
		// getting a value by using key
		System.out.println(map.get(2));
		
		// iterating over hash map
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+" : "+value);
		}
	}
	
}
