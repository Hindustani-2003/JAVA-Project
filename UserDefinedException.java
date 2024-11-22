package com.gsv.basics;

import java.util.Scanner;

class CustomException extends Exception //extends runtimeException (for making it runtime exception). Right now it is compile time exception
{
    public CustomException(String message)
    {
        super(message);
    }
}


public class UserDefinedException {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int age=ip.nextInt();
		
		if(age<0)
		{
			try
			{
				throw new CustomException("Age -ve not possible");
			}
			catch (CustomException ex)
			{
				ex.printStackTrace();
			}
			
				
		}
		else
		{
			System.out.println("age is "+age);
		}
	}
}
