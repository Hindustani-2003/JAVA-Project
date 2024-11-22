package com.gsv.basics;


class Demo
{
	int i=10;
	static int j=100;
	
	static void display()
	{
		System.out.println("Static Demo");
		System.out.println("static j"+j);
		System.out.println("Non static i cannot be shown in static method");  //non static variable cannot be accessed in static method
		
	}
	void display2()    //static variable can be accessed in non static method, like 'j' here. But need to make an object to access static through non static method
	{
		System.out.println("Non static"+i+j);  
	}
	
}


public class Static_NonStatic {

	public static void main(String[] args) {
		Demo.display();  //static function can also be called using class name directly
		Demo d=new Demo();  
		d.display2();  //non static method can only be called using object of class
		d.display(); //this can also be done
		//static methods are inherited
	}

}
