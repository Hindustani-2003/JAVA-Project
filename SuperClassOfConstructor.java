package com.gsv.basics;

class Super extends Object  //'extends object' is by default called as we use a constructor
{
	Super()  //constructor
	{
		super();  //by default it would be written even if we don't write it.
		System.out.println("Default Constructor");
	}
}

public class SuperClassOfConstructor {

	public static void main(String[] args) {
		
		Super s=new Super();
	}

}
