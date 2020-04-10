package com.springData.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springData.crud.model.Employee;
import com.springData.crud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee createEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	@Override
	public Employee getEmployeeByLastName(String lastName) {
		return employeeRepo.findByLastName(lastName);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}
	
	@Override
	public Employee findEmployeeByLastNameAndAddress(String lastName, String address) {
		return employeeRepo.findByLastNameAndAddress(lastName, address);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeRepo.findById(id).get();
	}

	@Override
	public boolean checkPresentOrNot(int id) {
		return employeeRepo.existsById(id);
	}

	@Override
	public long countEmployees() {
		return employeeRepo.count();
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepo.deleteById(id);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeRepo.delete(emp);
	}

	@Override
	public void deleteAllEmployee() {
		employeeRepo.deleteAll();
	}

}//class
