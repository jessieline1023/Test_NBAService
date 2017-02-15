package test;

public class ThreadTest {
	public static void main(String[] args) {
		Runner1 r = new Runner1();  //new了一个线程对象出来
//		Thread t = new Thread(r);  //父类的引用
		r.start();  //起新线城

//		r.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("main thread: -----" + i);
		}
	}



}
//runnable接口 线程类
class Runner1 extends Thread{
	public void run(){
		for(int i=0; i<100;i++){
			System.out.println("Runner1 :"+i );
		}
	}
}


/*class Runner1 implements Runnable {
	public void run(){
		for(int i=0; i<100;i++){
			System.out.println("Runner1 :"+i );
		}
	}
}*/