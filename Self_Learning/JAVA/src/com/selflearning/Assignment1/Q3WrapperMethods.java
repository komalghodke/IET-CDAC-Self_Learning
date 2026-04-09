package com.selflearning.Assignment1;
/*
 * Q 2. Use different methods of java defined wrapper classes.  
 */
public class Q3WrapperMethods {
    public static void main(String[] args) {
        Integer num = 100;

        System.out.println("Compare: " + num.compareTo(50)); // >0
        System.out.println("Parse: " + Integer.parseInt("123"));
        System.out.println("Max: " + Integer.max(10,20));
        System.out.println("Binary: " + Integer.toBinaryString(num));
    }
}
