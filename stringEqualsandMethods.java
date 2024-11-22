package com.gsv.basics;

public class stringEqualsandMethods {

	public static void main(String[] args) {
		String s1="ja";
		String s2="va";
		String s3="ja"+"va";
		String s4="ja"+s2;
		String s5=s1+"va";
		String s6=s1+s2;
		String s7=new String("java");
		String s8="java";
		
		int i=10;
		int j=10;
		System.out.println(i==j);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s4==s5);  //always compare addresses
		System.out.println(s5==s6);
		System.out.println(s6==s7);
		System.out.println(s7==s8);
		System.out.println(s3==s8);  //gives true since stored on same address memory
		
		//equals method to compare values
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s5));  //always compare addresses
		System.out.println(s5.equals(s6));
		System.out.println(s6.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s3.equals(s8));
		
		String str="My name is Khan";
		System.out.println(str.length());
		System.out.println("index of K: "+str.indexOf("K"));
		System.out.println("last index of char a: "+str.lastIndexOf("a"));
		System.out.println("char at 4: "+str.charAt(4));
		System.out.println(str.endsWith(""));
		System.out.println(str.concat(" 123"));
		
	}
}
