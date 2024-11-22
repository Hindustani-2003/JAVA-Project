package com.gsv.basics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		File f1 =null;
		FileWriter fw =null;
		FileReader fr=null;
		try
		{
		f1 = new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA\\Eclipse\\java\\src\\com\\gsv\\basics\\file.txt"); 
		fw = new FileWriter(f1);
		fw.write("GSV");
		System.out.println("Length of File "+f1.length());
		fr=new FileReader(f1);
		fr.read();  //returns int ascii value
		int ch = 0;
		while (fr.read()!=-1) {
			System.out.println((char)ch);
		}
		
		
		
		
		
		}
		catch(IOException ex)
		{
		ex.printStackTrace();
		}
		finally
		{
		try
		{
		if(fw!=null)
		{
		fw.flush();
		fw.close();
		fw =null;
		System.out.println("Length of File "+f1.length());
		}
		}
		catch(IOException ex)
		{
		ex.printStackTrace();
		}
		}
	}

}
