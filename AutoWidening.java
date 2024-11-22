package com.gsv.basics;
//heirarchy for conversion to function data type: byte>short>int>long>float>double
class tt
{
	void show(float i)
	{
		System.out.println("float: "+i);
	}
	void show(int i)        //only this runs because inputed data type is converted to function data type acc. to heirarchy 
	{
		System.out.println("auto Widening integer: "+i);
	}
//	void show(Integer j)  
//	{
//		System.out.println("Integer :"+j);
//	}
//	void show(byte j)
//	{
//		System.out.println("Auto widening byte: "+j);
//	}
}

public class AutoWidening {

	public static void main(String[] args) {
		tt obj=new tt();
		byte i=10;
		obj.show(i);
		Byte i2=new Byte(i); //auto boxing
		int i1=i2.intValue();  //type casting
		
	}
}
