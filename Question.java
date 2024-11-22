package com.gsv.basics;

public class Question {

	public static void main(String[] args) {
		
//		StringBuffer sb1= new StringBuffer("abc");
//		sb1.append("xyz");
//		sb1.append("\n");
//		sb1.append("hello\t");
//		sb1.append("test");
//		System.out.println(sb1);
//		
//		StringBuilder sb2=new StringBuilder();
//		String s1="abc";
//		String s2="ABC";
//		String s3="xyz";
//		
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//	    System.out.println(s1.compareToIgnoreCase(s2));
		
//		StringBuffer sb1=new StringBuffer();
//		sb1.append("vrb");
//		sb1.append("123");
//		System.out.println(sb1);
//		StringBuffer sb2=new StringBuffer();
//		sb2.append("vrb");
//		sb2.append("123");
//		System.out.println(sb2);
//	    System.out.println(sb1.equals(sb2));
//	    System.out.println(sb1.hashCode());
//     	System.out.println(sb2.hashCode());
	
//		String s1= "abc xyz";
//		s1.trim();
//		System.out.println(s1.trim());
//		System.out.println(s1.length());
//		s1=s1.trim();
//		System.out.println(s1.trim().length());
		
//		StringBuilder sb=new StringBuilder();
//		sb.append("abaababv");
//		sb.append("abcbabc");
//		System.out.println(sb.capacity());  //gives size+1
//		System.out.println("=====");
//		sb.trimToSize();
//		System.out.println(sb.length()); //gives size
		
//		try
//		{
//			System.out.println(1);
//			String s=null;
//			System.out.println(s);
//			System.out.println(s.length());
//			System.out.println(2);
//			
//		}
//		catch(NullPointerException ex)
//		{
//			System.out.println(4);
//			System.out.println(5);
//		}
//		System.out.println(6);    //o/p--> 1  null 4 5 6
		
		
//		try
//		{
//		System.out.println(1);
//		int i=10/0;
//		
//		}
//		catch(NullPointerException ex)
//		{
//		   
//			System.out.println(4);
//			try
//			{
//				int i=23/0;
//			}
//			catch(ArithmeticException ex1)
//			{
//				System.out.println(5);
//				
//			}
//			finally
//			{
//				System.out.println(6);
//				
//			}
//			System.out.println(7);            //Q16 and Q17 gives compile time error 
			
			
//			String url="https://sdjinfosoft.com";
//			System.out.println(url.indexOf('//')==url.lastIndexOf('//'));
		
		
//		String letter="a,b,c,d,e,f";
//		System.out.println(letter.split(",",2)[0]);
//		String[] a = letter.split(",",2);
//		System.out.println(a);
		
//		String s1="a";
//		s1.replace("a", "new").concat("onceAgainNew").replace("n", "not").substring(3);
//		System.out.println(s1);
		
//	    StringBuffer sb=new StringBuffer("abc");
//	    sb.append("cba").replace(0, 2, "c").substring(0,4).reverse();
//	    System.out.println(sb);
//        
//		StringBuffer S=new  StringBuffer("abc");
//		S.append("cba");
//		System.out.println(S);
		
//		StringBuffer s=new StringBuffer("100");
//		int i=Integer.parseUnsignedInt(s);
		
		StringBuilder sb=new StringBuilder("sdj@blabala.com");
		sb.replace(sb.indexOf("."), sb.length(), ".com");
		System.out.println(sb);
		
		
		
		
		
		
		}
	}
	
	
	


