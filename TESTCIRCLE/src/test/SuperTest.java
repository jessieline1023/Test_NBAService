package test;

public class SuperTest {

	public static void main(String[] args) {
		SubTest sc1 = new SubTest();
		SubTest sc2 = new SubTest(400);
	}
}

class SubTest extends SuperClass2 {
	private int n;

	SubTest(int n) {
		System.out.println("subclass(" + n + ")");
		this.n = n;
	}

	SubTest() {
		super(200);
		System.out.println("subclass()");
	}
}

class SuperClass2 {
	private int n;

	SuperClass2() {
		System.out.println("superclass()");
	}

	SuperClass2(int n) {
		System.out.println("SuperCLASS(" + n + ")");
		this.n = n;
	}
}