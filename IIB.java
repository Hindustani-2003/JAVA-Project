package com.gsv.basics;

class AA extends Object    //7
{
	AA()                  //3
	{
		this(10);         //4
		System.out.println("A constructor");   //10
		
	}
	
	AA(int i)            //5
	{
		super();         //6
		//IIB A called here  //---->8   
		System.out.println("Parametrized A");  //9
	}
	{
		System.out.println("IIB A");   //8
	}
}
class B extends AA
{
	B()                  //1
	{
		super();         //2
		//IIB B called here  //--->11
		System.out.println("B constructor");   //12
	}
	
	{
		System.out.println("IIB B");   //11
	}
}


public class IIB {        //Instance Initialisation Block

	public static void main(String[] args) {
		
		B b=new B();   //object of B formed  
		

	}

}
