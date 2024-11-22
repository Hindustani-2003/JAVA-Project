package com.gsv.basics;

import java.util.Scanner;

class A
{
	void car(int a)            //method created
	{
		System.out.println("Car 1"); 
		
	}
	void car(int a,int b)      //method overloading as no. of parameters changed
	{
		System.out.println("Car 2");
		
	}
	void car(int a,float c)    //method overloading as data type of parameters changed 
	{
		System.out.println("Car 3");
	}
	void car(float c,int a)       //method overloading as order of input changed 
	{
		System.out.println("Car 4");
	}
	

}

public class Overloading {

	public static void main(String[] args) {
		A Obj=new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("a: ");
		int a=sc.nextInt();
		System.out.println("b: ");
		int b=sc.nextInt();
	    System.out.println("c: ");
		float c=sc.nextFloat();
		Obj.car(a);
		Obj.car(a, b);
		Obj.car(a, c);
		Obj.car(c, a);
		
		// TODO Auto-generated method stub

	}

}
