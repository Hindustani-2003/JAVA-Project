package com.gsv.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {  //to read

	  public static void main(String[] args) {
		File f1=null;
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try
		{
			f1=new File("C:\\\\Users\\\\ompan\\\\OneDrive\\\\Desktop\\\\Rahul Boi\\\\JAVA\\\\Eclipse\\\\java\\\\src\\\\com\\\\gsv\\\\basics\\\\file.txt");
			fis=new FileInputStream(f1);
			ois=new ObjectInputStream(fis);
			Person2 p2=(Person2)ois.readObject();
			System.out.println("Name"+p2.name);
			System.out.println("Age"+p2.age);
			System.out.println("weight: "+p2.weight);
			System.out.println("PID: "+p2.pid);
			System.out.println("aadhar:"+p2.aadhar);
			System.out.println("height: "+p2.height);
			
			
		}
		catch(IOException ex)
		{
			ex.getMessage();
			
		}
		 catch(ClassNotFoundException ex)
		{
			 ex.getMessage();
			 
		}
		
		 
		  
	}
	
	
	
	}


