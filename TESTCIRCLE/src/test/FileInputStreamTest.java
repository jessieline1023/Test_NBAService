package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
 public static void main(String[] args){
	 int b =0;
	 FileInputStream in =null;
	 try{
		 in = new FileInputStream("C:\\Users\\PC\\Desktop\\Cat.java");  //input���ļ������ȡ����
	 }catch(FileNotFoundException e){
		 System.out.println("�Ҳ���ָ���ļ�");
		 System.exit(-1);;
	 }
	 
	 
	 try{
		 long num = 0;
		 while((b = in.read()) !=-1){   //!=-1��˵��û�ж���In
			System.out.print((char)b); 
		 num++;
		 }
		 in.close();
		 System.out.println();
		 System.out.println("����ȡ��"+num+"���ֽ�");
	 }catch(IOException e1){
		 System.out.println("�ļ��xȡ�e�`");
		 System.exit(-1);
	 }
	 
	 
	 
	 
 }
}
