package com.selflearning.Assignment1;

import java.util.Comparator;

/*
Comparator implementation: sort by Salary.
*/
public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

