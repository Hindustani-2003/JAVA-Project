package com.gsv.basics;

interface AAa 
{
	float pi=3.14f;
	void show();
}
abstract class BBB  //implements AAa
{
	void info()
	{
		System.out.println("info abstract");
		
	}
	abstract void display();
	
}
class CCC extends BBB implements AAa
{
	void display()
	{
		System.out.println("C Display");
		
	}
	public void show()
	{
		System.out.println("C Show");
	}
}

public class InterfaceWithAbstract {

	public static void main(String[] args) {
		AAa a=new CCC();
		a.show();
//		a.display();  //not possible since it is undefined in AAA
//		a.info();       //same
		BBB b=new CCC();  //B contains only info() and display()
		b.display();
//		b.show(); //not possible when B is not implementing interface. But possible if I make B implement interface A.
		b.info();
		CCC c=new CCC();  //best thing is to make object of C class with the reference of C only. Since C is extending B as well as implementing A so, all methods are present.
		c.display();
		c.info();
		c.show();
		
	}

}
