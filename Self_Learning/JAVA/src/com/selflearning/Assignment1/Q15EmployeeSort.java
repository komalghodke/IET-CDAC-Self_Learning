package com.selflearning.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Q. 15. Create a collection of Employee class and sort objects using comparable and comparator interfaces.
 */
class Emps implements Comparable<Emps> {
	int id;
	String name;
	double salary;

	Emps(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Emps other) {
		return Integer.compare(this.id, other.id);
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + salary;
	}
}

class NameComparator implements Comparator<Emps> {
	@Override
	public int compare(Emps e1, Emps e2) {
		return e1.name.compareTo(e2.name);
	}
}

class SalaryComparator implements Comparator<Emps> {
	@Override
	public int compare(Emps e1, Emps e2) {
		return Double.compare(e1.salary, e2.salary);
	}
}

public class Q15EmployeeSort {
	public static void main(String[] args) {
		List<Emps> employees = new ArrayList<>();
		employees.add(new Emps(3, "KG", 50000));
		employees.add(new Emps(1, "AG", 60000));
		employees.add(new Emps(2, "GK", 45000));

		Collections.sort(employees);
		System.out.println("Sorted by ID: " + employees);

		Collections.sort(employees, new NameComparator());
		System.out.println("Sorted by Name: " + employees);

		Collections.sort(employees, new SalaryComparator());
		System.out.println("Sorted by Salary: " + employees);
	}
}
