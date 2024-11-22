package com.gsv.basics;

import java.util.Scanner;

class Over
{
	int age;
	double weight;
	double height;
	
	Over(int age,double weight ,double height)
	{
		this.age=age;                    //'this.age' refers to the instance variable while 'age' refers to the parameter. Color helps us understand this thing 
		this.weight=weight;              // similar
		this.height=height;              // similar
	}
	void Rahul(int age,double weight,double height)
	{
		System.out.println("age: "+age);
		System.out.println("weight: "+weight);
		System.out.println("height: "+height);
		
	}

}

public class This_keyword_constructor {
	public static void main(String[] args) {
		int a;
		double b;
		double c;
		Scanner sc=new Scanner(System.in);
		System.out.println("input age: ");
		a=sc.nextInt();
		System.out.println("Input weight: ");
		b=sc.nextDouble();
		System.out.println("Input height: ");
		c=sc.nextDouble();
		
		Over Person=new Over(a,b,c);
		System.out.println("Bio of Rahul: ");
		Person.Rahul(a,b,c);
	}
}
	
	

