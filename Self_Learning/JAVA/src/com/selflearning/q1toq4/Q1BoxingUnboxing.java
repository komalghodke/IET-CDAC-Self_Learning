package com.selflearning.q1toq4;

/*
 * Q.1. Create sample classes to understand boxing & unboxing.  
 */
public class Q1BoxingUnboxing {
	public static void main(String[] args) {
		int a = 10;
		Integer boxed = Integer.valueOf(a);
		Integer autoBoxed = a;

		int unboxed = boxed.intValue();
		int autoUnboxed = autoBoxed;

		System.out.println("Boxed: " + boxed + ", Unboxed: " + unboxed);
	}
}
