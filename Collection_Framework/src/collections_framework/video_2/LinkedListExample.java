package collections_framework.video_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<Integer>();

		List<Integer> linkedList = new LinkedList<Integer>();

		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type ,List<Integer> list) {
		for(int i = 0 ; i < 1E5 ; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		// adding elements to end of list
//		for(int i = 0 ; i< 1E5 ;i++) {
//			list.add(i);
//		}
		
		// adding elements to beginning of list
//		for(int i = 0 ; i< 1E5 ; i++) {
//			list.add(0,i);
//		}
		
		
		// adding elements to near the end of list
//		for(int i = 0 ; i <1E5 ; i++) {
//			list.add(list.size()-100);
//		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken : "+(end-start)+" in ms for type :"+type);
	}

}
