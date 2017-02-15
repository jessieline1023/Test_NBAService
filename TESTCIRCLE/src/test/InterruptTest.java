package test;

import java.sql.Date;

public class InterruptTest {
public static void main(String[] args){
	Mythread thread = new Mythread();
	thread.start();
	try{
		Thread.sleep(5000);
		thread.flag =false;
	}catch(InterruptedException e){
		thread.interrupt();
	}
	
}
}

class Mythread extends Thread{
	boolean flag = true;
	public void run(){
		while(flag){
			System.out.println("it is "+new Date3(1000)+" time");
			try{
				sleep(1000); 
			}catch(InterruptedException e){
				return ;
			}
		}
	}
}


class Date3 extends Date{
	long t;
	public Date3(long t){
		super(t);
	}
}