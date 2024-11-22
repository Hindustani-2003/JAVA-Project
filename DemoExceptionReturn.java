package com.gsv.basics;

public class DemoExceptionReturn {

	  public static void main(String[] args) {
		
		  int j = test(5);
		  System.out.println("Value of j"+j);
		  
	}
	  public static int test(int i)
	  {
		  int j=0;
		  try
		  {
			  j=i/(i-9);
			  return j;
		  }
	      catch(ArithmeticException ex)
	      {
	    	  System.out.println("Divide by zero");
	    	  return 0;
	      }
	  }
	  
}
