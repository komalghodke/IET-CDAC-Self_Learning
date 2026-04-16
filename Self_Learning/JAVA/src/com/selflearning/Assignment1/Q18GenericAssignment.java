package com.selflearning.Assignment1;

import java.util.*;

/*
 Problem Statement:
 18. Create a Sample class to understand generic assignments using 
 “? extends SomeClass”, “? super SomeClass” and “?”
*/

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person: " + name;
	}
}

class Manager extends Employee {
	Manager(String name, double salary) {
		super(name, salary);
	}

	@Override
	public String toString() {
		return "Manager: " + name + ", Salary: " + salary;
	}
}

public class Q18GenericAssignment {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("KG", 60000));
		employees.add(new Employee("GK", 50000));

		List<Manager> managers = new ArrayList<>();
		managers.add(new Manager("AG", 80000));

		List<? extends Employee> empExtends = employees;
		empExtends = managers;
		System.out.println("Using ? extends Employee:");
		for (Employee e : empExtends) {
			System.out.println(e);

			List<? super Employee> empSuper = employees;
			empSuper.add(new Employee("ABC", 55000));
			empSuper.add(new Manager("XYZ", 90000));
			System.out.println("\nUsing ? super Employee:");
			for (Object obj : empSuper) {
				System.out.println(obj);
			}

			List<?> unknownList = managers;
			System.out.println("\nUsing ? (unbounded):");
			for (Object obj : unknownList) {
				System.out.println(obj);
			}
		}
	}
}
