package com.gsv.basics;

class ConstDemo
{
	ConstDemo()
	{
		super();
		System.out.println("ConstDemo Const");
	}
}
class ConstDemo2 extends ConstDemo   //sub class or derived class
{
	ConstDemo2()
	{
		super();
		System.out.println("ConstDemo2 Const");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		ConstDemo cd=new ConstDemo2();  //parent class can be used as reference to create object of sub class.
		ConstDemo2 cd2=new ConstDemo2(); //sub class itself can be used to create object of sub class
		//sub class cannot be used as reference to create object of parent class(important)
	}


}
