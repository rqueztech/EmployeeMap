/*
 * Create an employee class that will store all of the information
 * for each employee. */
package org.example;

public class Employee {

	// Set the private variables for the employee class
	private String employee_id;
	private String first_name;
	private String last_name;
	private String email;

	// Create the constructor for the employee class
	public Employee(String employee_id, String first_name, String last_name, String email) {
		this.setEmployeeId(employee_id);
		this.setFirstName(first_name);
		this.setLastName(last_name);
		this.setEmail(email);
	}

	// Create the getter methods for the employee class
	// GETTERS
	public String getEmployeeId() {
		return this.employee_id;
	}

	public String getFirstName() {
		return this.first_name;
	}

	public String getLastName() {
		return this.last_name;
	}

	public String getEmail() {
		return this.email;
	}

	// SETTERS
	public void setEmployeeId(String employee_id) {
		this.employee_id = employee_id;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean equals(Employee emp) {
		if (this.employee_id.equals(emp.getEmployeeId()) && this.first_name.equals(emp.getFirstName())
				&& this.last_name.equals(emp.getLastName()) && this.email.equals(emp.getEmail())) {
			return true;
		} else {
			return false;
		}
	}

	public void displayEmployee() {
		System.out.println("------------------------------");
		System.out.println("Employee ID: " + employee_id);
		System.out.println("First Name: " + first_name);
		System.out.println("Last Name: " + last_name);
		System.out.println("Email: " + email);
		System.out.println("------------------------------");
	}
}
