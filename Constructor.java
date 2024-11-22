package com.gsv.basics;
//Constructor is always created with the same name as class.
class Const
{
	Const()         //default constructor     //it would be created even if I don't declare it
	{
		System.out.println("Default Constructor Called.");
	}
	
	Const(int a)      //parameterized constructor      //Constructor Overloading
	{
		System.out.println("Parameterized Constructor Called.");
		
	}

}

public class Constructor {

	public static void main(String[] args) {
		Const A=new Const();   //formation of object i.e, default constructor object. Also the object is being called
		Const B=new Const(4);  //formation of another object i.e, parameterized constructor object. The object is being called
		System.out.println(A);  //string representation of the object A '@' shows the memory address
		System.out.println(B);  //string representation of the object B '@' shows the memory address
		
	}

}
