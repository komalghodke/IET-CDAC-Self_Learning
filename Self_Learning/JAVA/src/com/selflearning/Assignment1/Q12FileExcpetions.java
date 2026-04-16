package com.selflearning.Assignment1;

/* Q. 12. Create a user defined checked and unchecked exceptions.
 */
class InvalidEmployeeDataException extends Exception {
	public InvalidEmployeeDataException(String message) {
		super(message);
	}
}

class EmployeeNotFoundException extends RuntimeException {
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Q12FileExcpetions {

	public static void validateEmployee(Emp emp1) throws InvalidEmployeeDataException {
		if (emp1.id <= 0 || emp1.name == null || emp1.name.isEmpty()) {
			throw new InvalidEmployeeDataException("Invalid employee data: ID must be > 0 and name cannot be empty.");
		}
	}

	public static void findEmployeeById(int id) {
		if (id != 100) {
			throw new EmployeeNotFoundException("Employee with ID " + id + " not found.");
		}
	}

	public static void main(String[] args) {
		// Example 1: Checked Exception
		try {
			Emp emp1 = new Emp(0, "");
			validateEmployee(emp1);
		} catch (InvalidEmployeeDataException e) {
			System.out.println("Caught checked exception: " + e.getMessage());
		}

		// Example 2: Unchecked Exception
		try {
			findEmployeeById(200);
		} catch (EmployeeNotFoundException e) {
			System.out.println("Caught unchecked exception: " + e.getMessage());
		}

		// Example 3: Valid case
		try {
			Emp emp2 = new Emp(1, "KG");
			validateEmployee(emp2);
			System.out.println("Employee validated successfully: " + emp2.name);
		} catch (InvalidEmployeeDataException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
