package com.gsv.basics;

class OverRide    //Parent class or super class
{
	void Animal()
	{
		System.out.println("Animal makes sound");
	}
	
}  
class OverRide2 extends OverRide    //sub class 
{
	void Animal()
	{
		System.out.println("Dogs make sound");   //Animal() method is overridden in subclass OverRide2 
	}
}

public class OverRiding {

	public static void main(String[] args) 
	{
	
		OverRide ov=new OverRide();
		OverRide ov2=new OverRide2();
		
		ov.Animal();
		ov2.Animal();
		
	}

}
