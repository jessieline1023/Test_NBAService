package test;

public class Cat {
private  int sid=0;
private String name;
int id;
Cat(String name){
	this.name = name;
	id = sid++;
}
public void info(){
	System.out.println("My name is "+ " NO. " +id);
}

public static void main(String args[]){
//	Cat.sid = 100;
	Cat mimi = new Cat("mimi");
	Cat popo = new Cat("popo");
	mimi.info();
	popo.info();
}

}
