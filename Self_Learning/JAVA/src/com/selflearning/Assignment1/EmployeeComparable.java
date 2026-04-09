package com.selflearning.Assignment1;

/*
Comparable implementation: sort by ID.
*/
public class EmployeeComparable extends Employee implements Comparable<EmployeeComparable> {
	public EmployeeComparable(int id, String name, double salary) {
		super(id, name, salary);
	}

	@Override
	public int compareTo(EmployeeComparable other) {
		return Integer.compare(this.getId(), other.getId());
	}
}
