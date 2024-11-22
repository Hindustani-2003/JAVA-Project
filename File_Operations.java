package com.gsv.basics;

import java.io.File; 
import java.io.IOException;

public class File_Operations {

	public static void main(String[] args) {
		try
		{
		File f1=new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA\\Eclipse\\java\\src\\com\\gsv\\basics\\file.txt");
		//exists(): public boolean exists()
		
		
		boolean status1=f1.exists();
		System.out.println("Before status: "+ status1);
		//creating new file : public boolean createNewFile()
		f1.createNewFile();
		boolean status2=f1.exists();
		System.out.println("After status: "+status2);
		System.out.println("Name"+f1.getName());  //public string getName();
		System.out.println("Absolute path"+f1.getAbsolutePath());  //public string getAbsolutePath();
		System.out.println("Length"+f1.length());  //public long length();
		//is file
		System.err.println("It is file or not :"+ f1.isFile());
		System.out.println("\"It is directory or not :"+f1.isDirectory());
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		
		}
		catch(IOException ex)
		{
//			ex.printStackTrace();
			System.out.println("IO exception occured");
		}
		
		
	} 
	
}
