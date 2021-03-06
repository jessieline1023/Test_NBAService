package test;

public class TestInterface {
	public static void main(String args[]) {
		Singer s1 = new Student2("le");
		s1.sing();
		s1.sleep();
		
		Singer s2 = new Teacher("steven");
		s2.sing();
		s2.sleep();
		Painter p1 =(Painter) s2;
		p1.paint();
		p1.eat();
	}
	void f(Singer s){
		s.sing();
	}
}

interface Singer {
	public void sing();

	public void sleep();
}

interface Painter {
	public void paint();

	public void eat();
}

class Student2 implements Singer {
	private String name;

	Student2(String name) {
		this.name = name;
	}

	public void study() {
		System.out.println("studying");
	}

	public String getName() {
		return name;
	}

	public void sing() {
		System.out.println("student is singing");
	}

	public void sleep() {
		System.out.println("student is sleeping");
	}

}

class Teacher implements Singer, Painter {
	private String name;

	private String getString() {
		return name;
	}

	Teacher(String name) {
		this.name = name;
	}

	public void teach() {
		System.out.println("teaching");
	}

	public void sing() {
		System.out.println("teacher is singing");
	}

	public void sleep() {
		System.out.println("teacher is sleeping");
	}

	public void paint() {
		System.out.println("teacher is painting");
	}

	public void eat() {
		System.out.println("teacher is eating");
	}

}
