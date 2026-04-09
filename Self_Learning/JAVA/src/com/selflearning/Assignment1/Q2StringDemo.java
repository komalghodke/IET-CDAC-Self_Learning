package com.selflearning.Assignment1;

/*
 * Q. 3 Create String Demo class and perform different string manipulation methods. 
 */

public class Q2StringDemo {
	public static void main(String[] args) {
		String s = "Hello Java World";

		System.out.println("Length: " + s.length());
		System.out.println("Uppercase: " + s.toUpperCase());
		System.out.println("Substring: " + s.substring(6, 10));
		System.out.println("Replace: " + s.replace("Java", "Python"));
		System.out.println("Contains 'World'? " + s.contains("World"));
	}
}
