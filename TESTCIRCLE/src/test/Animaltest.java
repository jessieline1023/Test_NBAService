package test;

public class Animaltest {
	public static void main(String args[]) {
//		Duck c = new Duck("dogname", "black");
		Dog d = new Dog("dogname", "black");
//		Lady l1 = new Lady("l1", c);
		Lady l2 = new Lady("l2", d);
//		l1.myPetEnjoy();
		l2.myPetEnjoy();

	}
}

abstract class Animal {
	public String name;

	public Animal(String name) {
		this.name = name;
	}

	abstract void enjoy(); /*{
		System.out.println("½ÐÉù.....");
	}*/
}

class Duck extends Animal {
	public String eyesColor;

	Duck(String n, String c) {
		super(n);
		eyesColor = c;
	}

	public void enjoy() {
		System.out.println("Ñ¼½ÐÉù....");
	}
}

class Dog extends Animal {
	public String furColor;

	Dog(String n, String c) {
		super(n);
		furColor = c;
	}

	public void enjoy() {
		System.out.println("¹·½ÐÉù.....");
	}
}

class Lady {
	private String name;
	private Animal pet;

	Lady(String name, Animal pet) {
		this.name = name;
		this.pet = pet;
	}

	public void myPetEnjoy() {
		pet.enjoy();
	}
}