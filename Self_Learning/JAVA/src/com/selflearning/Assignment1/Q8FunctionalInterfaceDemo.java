package com.selflearning.Assignment1;

/*
Q8.
Demonstrates functional interface with anonymous class and lambda expression.
*/

@FunctionalInterface
interface Greeting {
    void greet(String name);
}

public class Q8FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Greeting anon = new Greeting() {
            @Override
            public void greet(String name) {
                System.out.println("Hello (Anonymous): " + name);
            }
        };
        anon.greet("KG");

        Greeting lambda = (n) -> System.out.println("Hello (Lambda): " + n);
        lambda.greet("GK");
    }
}

