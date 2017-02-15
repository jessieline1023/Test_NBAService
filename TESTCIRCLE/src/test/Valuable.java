package test;

public interface Valuable {
 public double getMoney();
}

interface Protectable{
	public void beProtected();
}

abstract class Animal2{
	private String name;
	
	abstract void enjoy();
}
interface A extends Protectable{
	void m();
}


class GoldenMonkey extends Animal2 implements Valuable, Protectable{
	public double getMoney(){
		return 100;
	}
	public void beProtected(){
		System.out.println("live in the room");
	}
	
	public void enjoy(){
		
	}
	
	
	
}
