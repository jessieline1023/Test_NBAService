package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
public static void main(String[] args){
	int b = 0;
	FileInputStream in = null;
	FileOutputStream out = null;
	try{
		in = new FileInputStream("C:\\Users\\PC\\Desktop\\Cat.java");
		out = new FileOutputStream("C:\\Users\\PC\\Desktop\\Dog.java");
		while((b =in.read())!=-1){
			out.write(b);
		}
		in.close();
		out.close();
		
	}catch(FileNotFoundException e2){
		System.out.println("�Ҳ���ָ���ļ�");
		System.exit(-1);;
	}catch(IOException e1){
		System.out.println("�ļ����ƴ���");
		System.exit(-1);
	}
	System.out.println("�ļ��Ѹ���");
	
	try{FileInputStream dog = new FileInputStream("C:\\Users\\PC\\Desktop\\Dog.java");
	int t = 0;
	while((t =dog.read()) != -1){
		System.out.print((char)t);
	}
	dog.close();
	}catch(FileNotFoundException e3){
		System.out.println("�ļ�û���ҵ�");
	}catch(IOException e4){
		System.out.println("�ļ����Ƶ�ʱ�򱨴���");
	}
}
}
