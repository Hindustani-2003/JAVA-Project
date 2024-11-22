package com.gsv.basics;

 

public class WrapperClass {

	public static void main(String[] args) 
	{
		int i=10;
		Integer int1=new Integer(i); //auto boxing of integer(primitive to derive(object))
		int int2=int1.intValue();  //unboxing of integer(deriving(object) to primitive)
		byte int3=int1.byteValue(); //type casting
		
	}
}
