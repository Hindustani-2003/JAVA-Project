package com.gsv.basics;
//we use throws only for compile time exceptions
public class ExceptionDuckingExplicit {
	
	  
	public static void main(String[] args) 
	   {
		System.out.println("main start");
		test(9);
//		try
//		{
//			test(9);
//		}
//		catch(ClassNotFoundException ex)
//		{
//			System.out.println("Class not Found!");
//		}
		System.out.println("main end");
	}	
	   public static void test(int i) 
	   {
		   System.out.println("test start");
//		   test1(9);
		   try
		   {
			   test1(9);
		   }
		   catch(ClassNotFoundException ex)
		   {
			   System.out.println("Class not Found!");
		   }
		   System.out.println("test end");
	   }

	   public static void test1(int i) 
	   {
		   System.out.println("test1 start");
		   test2(9);
//		   try
//		   {
//			   test2(9);
//		   }
//		   catch(ClassNotFoundException ex)
//		   {
//			   System.out.println("Class not Found!");
//		   }
		   System.out.println("test1 end");
	   }
	   
	   public static void test2(int i) 
	   {
		   System.out.println("test2 start");
//		   Class.forName("");		 
		 try 
		 {
			Class.forName("");
			
		 }
		 catch(ClassNotFoundException ex)
		 {
			 System.out.println("Class Not Found!");
		 }
		   
		   System.out.println("test2 end");
	   }
	   
	   
	}


