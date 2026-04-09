package com.selflearning.q1toq4;

/*
Q.6 Demonstrates different types of inheritance in Java.
*/

class A { void show(){System.out.println("Class A");} }
class B extends A { void display(){System.out.println("Class B");} }

class C extends B { void print(){System.out.println("Class C");} }

class D extends A { void dMethod(){System.out.println("Class D");} }
class E extends A { void eMethod(){System.out.println("Class E");} }

interface X { void methodX(); }
interface Y { void methodY(); }
class F implements X,Y {
    public void methodX(){System.out.println("Method X");}
    public void methodY(){System.out.println("Method Y");}
}

public class Q6Inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        B b = new B();
        b.show(); b.display();

        // Multilevel Inheritance
        C c = new C();
        c.show(); c.display(); c.print();

        // Hierarchical Inheritance
        D d = new D(); d.show(); d.dMethod();
        E e = new E(); e.show(); e.eMethod();

        // Multiple Inheritance via Interfaces
        F f = new F(); f.methodX(); f.methodY();
    }
}
