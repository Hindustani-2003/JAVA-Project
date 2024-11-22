package com.gsv.basics;

class AAA
{
	static
	{
		System.out.println("SIB AAA");     //won't be called again if new object of this class is made
	}
	AAA()
	{
		System.out.println("Constructor AAA");
	}
	{
		System.out.println("IIB AAA");  //IIB
	}
	
}

public class SIB {

	 static
	 {
		 System.out.println("SIB Main");
	 }
	 public static void main(String[] args) {
		
		 System.out.println("Main Start");
		 AAA a=new AAA();
		 AAA b=new AAA();
		 
		 
	}
    static
    {
    	System.out.println("SIB 2");
    }
}
