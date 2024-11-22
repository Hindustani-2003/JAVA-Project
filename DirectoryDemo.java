package com.gsv.basics;

import java.io.File;
import java.io.IOException;

public class DirectoryDemo
{

	public static void main(String[] args)
	{
		
		try {
		
	File f2=new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA");
	f2.mkdir();
	System.out.println(f2.isDirectory());
	System.out.println(f2.exists());
	System.out.println(f2);
	
	File f3=new File(f2,"GSV.java");
	f3.createNewFile();
	System.out.println("F3 exists: "+f3.exists());
	System.out.println("F3 is directory: "+f3.isDirectory());
	String all[]=f2.list();
	
	int fcount=0;
	int dcount=0;
	for(String name: all)
	{
		File F4=new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA"+name);
		System.out.println(F4.getName());
		if(F4.isFile())
		{
			fcount++;
		}
		if(F4.isDirectory())
		{
			dcount++;
		}
		
	}
	System.out.println("file number: "+fcount);
	System.out.println("directory number: "+dcount);
	
	
	
	
		}
		
		catch(IOException ex)
	
		{
			System.out.println("IO Exception occured");
//			ex.printStackTrace();
		}
	}

}
