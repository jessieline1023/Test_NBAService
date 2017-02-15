package test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add(new Name("f1", "l1"));
		System.out.println(c);
		c.remove("hello");
		System.out.println(c.remove(new Name("f1", "l1")));
	}
}

class Name implements Comparable {
	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	
	public int hashCode(){
		return firstName.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);
		
		return (lastCmp!=0? lastCmp: firstName.compareTo(n.firstName));

	}

}