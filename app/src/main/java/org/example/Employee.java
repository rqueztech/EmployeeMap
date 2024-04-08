/*
 * Create an employee class that will store all of the information
 * for each employee. */
class Employee {

	// Set the private variables for the employee class
	private String employee_id;
	private String first_name;
	private String last_name;
	private String email;

	// Create the constructor for the employee class
	public Employee(String employee_id, String first_name, String last_name, String email) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
	}

	// Create the getter methods for the employee class
	// GETTERS
	public String getEmployeeId() {
		return employee_id;
	}

	public String getFirstName() {
		return first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public String getEmail() {
		return email;
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
}
