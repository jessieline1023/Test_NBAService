package test;

public class JoinThreadTest {
	public static void main(String[] args){
		MyThread2 t2 = new MyThread2("t2");
	    t2.start();
	    try{
	    	t2.join();
	    }catch(InterruptedException e){
	    }
	    for(int i =1; i<10;i++){
	    	System.out.println("i am main thread");
	    }
	    
	    
	}

}

class MyThread2 extends Thread{
	MyThread2(String s){
		super(s);
	}
	
	public void run(){
		for(int i =1; i<10; i++){
			System.out.println("i am "+getName());
			try{
				sleep(1000);
			}catch(InterruptedException e ){
				return;
			}
		}
	}
}
