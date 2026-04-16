package com.selflearning.Assignment1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* Q. 17. Create an Employee HashSet collection and override equals & hashCode 
 methods to understand how the set maintains uniqueness using these methods.
*/

class Employees {
	int id;
	String name;
	double salary;

	Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return id + " - " + name + " - " + salary;
	}
}

public class Q17EmpHashSet {
	public static void main(String[] args) {
		Set<Employees> employees = new HashSet<>();

		employees.add(new Employees(1, "GK", 60000));
		employees.add(new Employees(2, "KG", 45000));
		employees.add(new Employees(3, "AG", 50000));

		employees.add(new Employees(1, "K", 70000));

		System.out.println("Employees in HashSet:");
		for (Employees e : employees) {
			System.out.println(e);
		}
	}
}
