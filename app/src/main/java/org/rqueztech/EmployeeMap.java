/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.rqueztech;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class EmployeeMap {
	private Map <String, Employee> employeeMap;
    public int empNo;
    public CsvOperations csvOperations;

	public EmployeeMap() {
		this.employeeMap = new HashMap<String, Employee>();
        this.csvOperations = new CsvOperations();
	}

	public Map<String, Employee> getEmployeeMap() {
		return this.employeeMap;
	}

	public void addEmployee(String first_name, String last_name, String email) {
        List <String[]> rowToWrite = new ArrayList<>();

        System.out.println("Add Employee");
        
        String employee_id = String.valueOf(++empNo);
		this.getEmployeeMap().put(employee_id , new Employee(employee_id, first_name, last_name, email));
        rowToWrite.add(this.getEmployeeMap().get(employee_id).asList());

        this.csvOperations.writeCsvFile("Employee.csv", rowToWrite);

	}

	public void removeEmployee(String empId) {
		this.getEmployeeMap().remove(empId);
	}

	public Employee getEmployee(String empId) {
		return this.employeeMap.get(empId);
	}

    public void displayEmployees() {
        System.out.println("Display Employees");
        for (Map.Entry<String, Employee> entry : this.employeeMap.entrySet()) {
            System.out.println("================================");
            System.out.println("Employee ID: " + entry.getKey());
            System.out.println("First Name: " + entry.getValue().getFirstName());
            System.out.println("Last Name: " + entry.getValue().getLastName());
            System.out.println("Email: " + entry.getValue().getEmail());
            System.out.println("================================");
        }
    }

}
