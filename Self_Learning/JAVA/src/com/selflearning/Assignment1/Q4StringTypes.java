package com.selflearning.Assignment1;

/*
 * Q. 4. Implement  String ,  StringBuffer , StringBuilder
 */
public class Q4StringTypes {
	public static void main(String[] args) {
		String s = "Hello";
		s.concat(" World"); 
		System.out.println("String: " + s);

		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println("StringBuffer: " + sb);

		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append(" World");
		System.out.println("StringBuilder: " + sb2);
	}
}
