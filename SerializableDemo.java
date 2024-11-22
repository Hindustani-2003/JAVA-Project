package com.gsv.basics;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableDemo {  //to write

      public static void main(String[] args) {
		
    	  Person2 p2=new Person2();
    	  p2.name="Rahul Boi";
    	  p2.age=21;
    	  p2.aadhar=1234567;
    	  p2.weight=69;
    	  p2.height=5.9;
    	  p2.pid=143;
    	  File f2=null;
    	  FileOutputStream fos=null;
    	  ObjectOutputStream oos=null;
    	  
    	  try
    	  {
    		  f2 = new File("C:\\Users\\ompan\\OneDrive\\Desktop\\Rahul Boi\\JAVA\\Eclipse\\java\\src\\com\\gsv\\basics\\file.txt");
    		  fos = new FileOutputStream(f2);
    		  oos=new ObjectOutputStream(fos);
    		  oos.writeObject(p2);
    	  }
    	  catch(IOException ex)
    	  {
    		  ex.printStackTrace();
    	  }
    	  finally
    	  {
    		  try
    		  {
    			  if(oos!=null)  //child class 
    			  {
    				  oos.flush();
    				  oos.close();
    				  oos=null;
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
    				  fos.flush();
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


