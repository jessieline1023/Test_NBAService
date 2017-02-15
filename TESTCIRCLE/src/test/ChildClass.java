package test;

class FatherClass{
	public int values;
	public void f(){
		values = 100;
		System.out.println("FatherClass.value = " +values);
	}
}
public class ChildClass extends FatherClass {
 public int values;
 public void f(){
	 super.f();
	 values = 200;
	 System.out.print("childClass.values= " +values);
	 System.out.println(values);
	 System.out.println(super.values);
	 
 }
 public static void main(String args[]){
	 ChildClass cc = new ChildClass();
	 cc.f();
 }
}
