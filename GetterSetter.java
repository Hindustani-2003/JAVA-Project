package com.gsv.basics;

class s
{
	private int age=10;
	private String name="Boii";
	
	public  int getAge()  //always make the first letter of private instance variable as capital
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
			
}

public class GetterSetter {

	public static void main(String[] args) {
		
		s change=new s();
		System.out.println(change.getAge());
		System.out.println(change.getName());
		change.setAge(9);                   //name and age of private instance variable changed
		change.setName("Rahul");
//		change.getName();
//		change.getAge();
		System.out.println(change.getAge());
		System.out.println(change.getName());
		
	}
}
