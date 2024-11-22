package com.gsv.basics;

public class StringBuff {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
//		StringBuffer sb2=sb.append("123");
//		System.out.println(sb==sb2); //returns true since both are on same memory address
		
		System.out.println(sb.append(" world")); // sb becomes "Hello world"
		System.out.println(sb.insert(0, "Hi ")); // sb becomes "Hi Hello world"
		System.out.println(sb.delete(0, 3)); // sb becomes "Hello world"
		System.out.println(sb.replace(6, 11, " there"));; // sb becomes "Hello there"
		System.out.println(sb.reverse());// sb becomes "ereht olleH"
		System.out.println(sb.capacity());
		
		
	}
}
