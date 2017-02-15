package test;

public class EnumTest {

	public enum MyColour{red, green, blue};
	
	public static void main(String[] args){
		MyColour m =MyColour.red;
		switch (m){
		case red:
			System.out.println("red");
			break;
		case green:
			System.out.println("green");
			break;
		case blue:
			System.out.println("blue");
			break;
			
		}
	}
}
