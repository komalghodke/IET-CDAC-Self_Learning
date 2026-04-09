package com.selflearning.q1toq4;

/*
Main driver to demonstrate OOP principles.
*/
public class OOPDemoApp {
    public static void main(String[] args) {
        // Encapsulation
        Employee emp = new Employee(1,"Komal",50000);
        System.out.println(emp);
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());

        // Abstraction + Inheritance + Polymorphism
        Q5Shape s1 = new Circle();  // runtime polymorphism
        Q5Shape s2 = new Rectangle();
        s1.draw();
        s2.draw();
    }
}

