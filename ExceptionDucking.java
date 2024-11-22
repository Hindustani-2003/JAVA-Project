package com.gsv.basics;


public class ExceptionDucking {
   public static void main(String[] args) {
	System.out.println("main start");
	test(9);
	System.out.println("main end");
}	
   public static void test(int i)
   {
	   System.out.println("test start");
	   test1(9);
	   System.out.println("test end");
   }

   public static void test1(int i)
   {
	   System.out.println("test1 start");
	   test2(9);
	   System.out.println("test1 end");
   }
   
   public static void test2(int i)
   {
	   System.out.println("test2 start");
	   try
	   {
	   int j=i/(i-9);
	   }
	   catch(ArithmeticException ex)
	   {
		   System.out.println("Divide by zero");
	   }
	   System.out.println("test2 end");
   }
   
   
}
