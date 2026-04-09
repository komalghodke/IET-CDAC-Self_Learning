package com.selflearning.Assignment1;

/*
 * Q. 11. Create a collection of Employee class and sort objects using comparable and comparator interfaces.
 */

public class Q11Employee {
    private int id;
    private String name;
    private double salary;

    public Q11Employee(int id,String name,double salary) {
        this.id=id; this.name=name; this.salary=salary;
    }

    public int getId(){return id;}
    public String getName(){return name;}
    public double getSalary(){return salary;}

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }
}
