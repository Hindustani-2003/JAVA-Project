package com.gsv.basics;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
		FileReader fr=null;
		File f1 = new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA\\Eclipse\\java\\src\\com\\gsv\\basics\\file.txt");
		fr=new FileReader(f1);
//		fr.read();  //returns int ascii value
//		int ch=0;
//		while (fr.read()!=-1) {
//			System.out.println((char)ch);
//		}
		long len=f1.length();
		char chr[]=new char[(int)len];
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
		
	}

}
