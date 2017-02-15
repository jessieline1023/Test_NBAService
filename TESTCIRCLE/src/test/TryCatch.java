package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatch {
	public static void main(String[] args) {
		
		TryCatch te = new TryCatch();
		te.manager();;
		}
		public void regist(int num) throws MyException{
			if(num<0){
				throw new MyException("����Ϊ��ֵ�� ������", 3);
			}
			System.out.println("�Ǽ�����"+num);
		}
		
		public void manager(){
			System.out.println("��������");
		}
		
		
		
	}


class Test {
	int i;
	/*
	 * void m(int i ) throws ArithmeticException{ if(i == 0){ throw new
	 * ArithmeticException("������Ϊ0"); }
	 * 
	 * }
	 */

	/*
	 * void f() throws FileNotFoundException, IOException{ FileNotFoundException
	 * in = new FileNotFoundException("myfile.txt"); int b; b = in.read();
	 * while(b != 1){
	 * 
	 * } }
	 */

	void m() {
		FileInputStream in = null;
		try {
			in = new FileInputStream("myfile.txt");
			int b;
			b = in.read();
			while (b != -1) {
				System.out.println((char) b);
				b = in.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

class MyException extends Exception {
	private int id;

	public MyException(String message, int id) {
		super(message);
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
