package test;

public class ThreadSycTest implements Runnable{
	Timer timer = new Timer();
	public static void main(String[] args){
		ThreadSycTest t1 = new ThreadSycTest();
		ThreadSycTest t2 = new ThreadSycTest();
/*		t1.start;
		t2.start;*/
		
	}
	
	public void run(){
		timer.add(Thread.currentThread().getName());
	}
	
}





class Timer{
	private static int num = 0;
	public void add(String name){
		num++;
		try{
			Thread.sleep(1);
		}catch(InterruptedException e){
			System.out.println(name+", 你是第"+num+"个使用timer的线程");
		}
	}
}