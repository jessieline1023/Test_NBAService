package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
 public static void main(String[] args){
	 int b =0;
	 FileInputStream in =null;
	 try{
		 in = new FileInputStream("C:\\Users\\PC\\Desktop\\Cat.java");  //input从文件里面读取数据
	 }catch(FileNotFoundException e){
		 System.out.println("找不到指定文件");
		 System.exit(-1);;
	 }
	 
	 
	 try{
		 long num = 0;
		 while((b = in.read()) !=-1){   //!=-1就说明没有读完In
			System.out.print((char)b); 
		 num++;
		 }
		 in.close();
		 System.out.println();
		 System.out.println("共读取了"+num+"个字节");
	 }catch(IOException e1){
		 System.out.println("文件讀取錯誤");
		 System.exit(-1);
	 }
	 
	 
	 
	 
 }
}
