package com.selflearning.Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q11EmployeeCollections {
	public static void main(String[] args) {
		List<EmployeeComparable> list = new ArrayList<>();
		list.add(new EmployeeComparable(3, "KG", 50000));
		list.add(new EmployeeComparable(1, "GK", 60000));
		list.add(new EmployeeComparable(2, "ABC", 55000));

		System.out.println("Original List:");
		for (EmployeeComparable e : list)
			System.out.println(e);

		Collections.sort(list);
		System.out.println("\nSorted by ID (Comparable):");
		for (EmployeeComparable e : list)
			System.out.println(e);

		Collections.sort(list, new EmployeeComparator());
		System.out.println("\nSorted by Salary (Comparator):");
		for (EmployeeComparable e : list)
			System.out.println(e);
	}
}
