package test;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

public class ListTest {
	public static void main(String[] args) {
		/*
		 * LinkedList l1 = new LinkedList(); for(int i = 0; i<5;i++){
		 * l1.add("a"+i); } System.out.println(l1); l1.add(3, "a100");
		 * System.out.println(l1); l1.set(5, "a200"); System.out.println(l1);
		 * System.out.println((String)l1.get(2));
		 * System.out.println(l1.indexOf("a3")); l1.remove(1);
		 * System.out.println(l1);
		 */
/*		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		for (int i = 0; i < 9; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		Collections.shuffle(l1);
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1, "a5"));*/
		
LinkedList l1 = new LinkedList();
l1.add(new Name("Karl", "M"));
l1.add(new Name("Steven", "Lee"));
l1.add(new Name("John", "o"));
l1.add(new Name("Tom", "M"));
System.out.println(l1);
Collections.sort(l1);
System.out.println(l1);

		

	}

}
