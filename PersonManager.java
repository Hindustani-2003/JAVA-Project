package com.gsv.basics;

class Person extends Object
{
	int age;
	float weight;
	double height;
	
	public Person(int age,float weight,double height)
	{
		this.age=age;
		this.weight=weight;
		this.height=height;
	}
	
	public String toString()    //to get the the content of person object made by the user
	{
		return "Age: "+age+"Weight: "+weight+"Height: "+height;
	}
	
	public boolean equals(Object obj)
	{
		Person p2=(Person) obj;
		if(this.age==p2.age&&this.weight==p2.weight&&this.height==p2.height)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode()
	{
		//1 convert all data type to string
		String strAge=String.valueOf(age);
		String strWeight=String.valueOf(weight);
		String strHeight=String.valueOf(height);
		
		//2 find out the hashcode
		int hash=0;
		int hashage=strAge.hashCode();
		int hashweight=strWeight.hashCode();
		int hashHeight=strHeight.hashCode();
		
		//3 sum of all hashcode
		hash=hash+hashage+hashweight+hashHeight;
		
		return hash;
	}
}

public class PersonManager {
	public static void main(String[] args) {
		int i=4, j=4;
		System.out.println("Value of i: "+i);
		System.out.println("Value of j"+j);
		System.out.println(i==j);
		
		Person p1=new Person(21,68,5.8);
		Person p2=new Person(21,68,5.8);
//		System.out.println(p1);
//		System.out.println(p2);
		System.out.println(p1.toString());
//		p2.toString();
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.hashCode()==p2.hashCode());
		
		
	}

}
