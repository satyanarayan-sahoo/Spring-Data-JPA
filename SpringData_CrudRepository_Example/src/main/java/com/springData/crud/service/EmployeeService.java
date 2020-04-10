package com.springData.crud.service;

import java.util.List;

import com.springData.crud.model.Employee;

public interface EmployeeService {
	
	Employee createEmployee(Employee emp);
	
	Employee getEmployeeByLastName(String lastName);
	
	List<Employee> getEmployees();
	
	Employee findEmployeeByLastNameAndAddress(String lastName,String address);
	
	Employee getEmployeeById(int id);
	
	boolean checkPresentOrNot(int id);
	
	long countEmployees();
	
	void deleteEmployeeById(int id);
	
	void deleteEmployee(Employee emp);
	
	void deleteAllEmployee();
}
