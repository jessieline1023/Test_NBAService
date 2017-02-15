package test;

import java.io.File;
import java.io.IOException;

public class FileTest {
public static void main(String[] args){
	String separator = File.separator;
	String fileName = "myfile.txt";
	String directory = "mydir1" + separator +"mydir2";
	File f = new File(directory, fileName);
	if(f.exists()){
		System.out.println("file Name: " +f.getAbsolutePath());
		System.out.println("file size: " +f.length());
	}else{
		f.getParentFile().mkdirs();
		try{
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
}
}
