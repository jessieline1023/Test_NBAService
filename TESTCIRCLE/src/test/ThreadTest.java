package test;

public class ThreadTest {
	public static void main(String[] args) {
		Runner1 r = new Runner1();  //new��һ���̶߳������
//		Thread t = new Thread(r);  //���������
		r.start();  //�����߳�

//		r.run();
		for (int i = 0; i < 100; i++) {
			System.out.println("main thread: -----" + i);
		}
	}



}
//runnable�ӿ� �߳���
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