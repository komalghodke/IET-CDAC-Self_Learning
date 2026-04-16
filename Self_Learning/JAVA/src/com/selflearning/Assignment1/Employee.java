package com.selflearning.Assignment1;

/*
 * 5. Create a class Employee and encapsulate the data members.  
 */
public class Employee {
	private int id;
	protected String name;
	protected double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String name2, double salary2) {
		name = name2;
		salary = salary2;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
