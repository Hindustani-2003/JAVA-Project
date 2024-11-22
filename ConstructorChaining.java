package com.gsv.basics;

class Aa
{
	Aa()   //9
	{
		super();  //10
		System.out.println("default Aa const");  //11
	}
	
}
class Ba extends Aa
{
    Ba()   //7
	{
    	super();  //8
		System.out.println("Default Ba Const");  //12
	}
	Ba(int i)   //5
	{
		this();  //6
		System.out.println("Parameterized Ba Const");  //13
	}
}
class Cc extends Ba
{
	Cc(int v)  //3
	{
	    super(3);  //4
		System.out.println("Parameterized Cc Const");  //14
	}
	Cc()   //1
	{
		this(11);  //2
		System.out.println("Dafault Cc Const");  //15
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		//making object of constructor
		Aa constructor=new Cc();    //we need to make a new object for every constructor in the class(to call it) whenever constructor is overloaded in the class
	}

	
	

}
