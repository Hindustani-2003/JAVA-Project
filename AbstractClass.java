package com.gsv.basics;

abstract class AnimalSound
{
	abstract void Sound();   //even if one method become abstract the whole class becomes abstract
	
}
class Cow extends AnimalSound   //when abstract method definition is not present even in inherited class, we need to make another inherited class
{
	void Sound()
	{
	   System.out.println("Cow says Mow");	
	}
}
class Cat extends AnimalSound
{
	void Sound()
	{
		System.out.println("Cat says meow");
	}
}
class Dog extends AnimalSound
{
	void Sound()
	{
		System.out.println("Dog barks");
	}
}


public class AbstractClass {

	public static void main(String[] args) {
		AnimalSound Cowsound=new Cow();   //abstract class can only be used as reference, we can't make its object
		AnimalSound Dogsound2=new Dog();
		AnimalSound Catsound3=new Cat();
		Cowsound.Sound();
		Dogsound2.Sound();
		Catsound3.Sound();
	}

}
