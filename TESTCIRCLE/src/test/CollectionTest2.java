package test;

import java.util.Collection;
import java.util.HashSet;

public class CollectionTest2 {
	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("hello");
		c.add(new Name("f1", "l1"));
		c.add(new Integer(100));
		System.out.println(c);
		System.out.println(c.remove("hello"));
		System.out.println(c.remove(new Integer(100)));
		System.out.println(c.remove(new Name("f1","l1")));
		System.out.println(c);
		
		
	}

}
