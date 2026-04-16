package com.selflearning.Assignment1;

public class EmployeeApp {
    public static void main(String[] args) {
    	Employee emp = new Employee(1,"Komal",50000);
        System.out.println(emp);
        emp.setSalary(60000);
        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
