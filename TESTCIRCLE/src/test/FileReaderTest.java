package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {
public static void main(String[] args){
	FileReader fr = null;
	int c = 0;
	FileWriter fw = null;
    int t = 0;
	try{
/*		fr = new FileReader("C:\\Users\\PC\\Desktop\\Dog.java");
		int in = 0;
		while((in =fr.read()) !=-1){
			System.out.print((char)in);
		}
		fr.close();
*/	
    fw = new FileWriter("C:\\Users\\PC\\Desktop\\Pig.java");
	for(int k = 0; k<=500000;k++){
		fw.write(k);
	}
	fw.close();
	
	}catch(FileNotFoundException e){
		System.out.println("找不到指定文件");
	}catch(IOException e2){
		System.out.println("文件读取错误");
	}
	System.out.println((char)t);
}
}
