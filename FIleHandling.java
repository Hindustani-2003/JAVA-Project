package com.gsv.basics;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FIleHandling {

	
	public static void main(String[] args) {
		
		File fl=null;
		FileReader fr=null;
		FileWriter fw=null;
		
		try
		{
		fl= new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA\\newfile.txt");
		fl.createNewFile();
		Boolean bool=fl.exists();
		System.out.println("File exists: "+bool);
		fw= new FileWriter(fl);
		fw.write("My name is Khan");
		System.out.println("length of file: "+fl.length());
		fr=new FileReader(fl);
		char chr[]=new char[(int)fl.length()];
		fr.read(chr);
		for(char c:chr)
		{
			System.out.println(c);
		}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally {
			try
			{
				if(fw!=null)
				{
					fw.flush();
					fw.close();
					System.out.println("length of file: "+fl.length());
				}
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
				
		
	}
}
