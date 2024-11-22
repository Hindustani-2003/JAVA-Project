package com.gsv.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileImageReadWrite {

	public static void main(String[] args) {
		File f1=null;
		File f2=null;
		FileInputStream fis=null;  // for reading
		FileOutputStream fos=null;  // for writing
		
		try
		{
			f1=new File("C:\\Users\\ompan\\OneDrive\\Pictures\\images.jpeg");
			fis=new FileInputStream(f1);
			//f1.length();
			byte b[]=new byte[(int)f1.length()]; //read data and store into byte array
			fis.read(b);
			System.out.println(f1.length());
			f2= new File("C:\\\\Users\\\\ompan\\\\OneDrive\\\\Pictures\\\\images2.jpeg");
			fos=new FileOutputStream(f2);
			fos.write(b);
			
			
			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();

		}
		finally
		{
			try
			{
				if(fis!=null)
				{
					fis.close();
					fis=null;
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(fos!=null)
				{
					fos.close();
					fos=null;
				}
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
		
		
	}

}
