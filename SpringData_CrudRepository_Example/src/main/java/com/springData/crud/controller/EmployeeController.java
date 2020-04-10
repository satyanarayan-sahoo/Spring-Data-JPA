package com.springData.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springData.crud.model.Employee;
import com.springData.crud.service.EmployeeService;


@RestController
@RequestMapping(value = "/employee",produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/* POST
	 * http://localhost:8080/employee/addEmployee
	 * { 
         "firstName":"Jahar",
         "lastName":"Jagdev",
         "address":"Bbsr"
       } 
	 */
	@PostMapping(value = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	/* GET
	 * http://localhost:8080/employee/allEmployees 
	 * */
	@GetMapping(value = "/allEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getEmployees();
	}
	
	/* GET
	 * http://localhost:8080/employee/getEmployeeByLastName/Babu
	 * */
	@GetMapping(value = "/getEmp/{lastName}")
	public Employee getEmployeeByLastName(@PathVariable String lastName) {
		return employeeService.getEmployeeByLastName(lastName);
	}
	
	/* GET
	 * http://localhost:8080/employee/getEmployee/11
	 * */
	@GetMapping(value = "/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	/* GET
	 * http://localhost:8080/employee/getEmployee?lastName=Babu&address=Bangalore
	 * */
	@GetMapping(value = "/getEmployee")
	public Employee findEmployeeByLastNameAndAddress(@Param(value = "lastName") String lastName,@Param(value = "address") String address) {
		return employeeService.findEmployeeByLastNameAndAddress(lastName, address);
	}
	
	/* GET
	 * http://localhost:8080/employee/checkPresentOrNot/11  -->true
	 * */
	@GetMapping(value = "/checkPresentOrNot/{id}")
	public boolean isPresent(@PathVariable int id) {
		return employeeService.checkPresentOrNot(id);
	}
	
	/* GET
	 * http://localhost:8080/employee/countEmployees
	 * */
	@GetMapping(value = "/countEmployees")
	public long countEmployees() {
		return employeeService.countEmployees();
	}
	
	/* DELETE
	 * http://localhost:8080/employee/deleteEmployee/11
	 * */
	@DeleteMapping(value = "/deleteEmployee/{id}")
	public void deleteEmployeeById(@PathVariable int id) {
		employeeService.deleteEmployeeById(id);
	}
	
	/* DELETE
	 * http://localhost:8080/employee/deleteEmployee
	 * {
        "eid": 10,
        "firstName": "Lipu",
        "lastName": "Mota",
        "address": "Mangalore"
       }
    */
	@DeleteMapping(value = "/deleteEmployee")
	public void deleteEmployee(@RequestBody Employee employee) {
		employeeService.deleteEmployee(employee);
	}
	
	/* DELETE
	 * http://localhost:8080/employee/deleteAll
	 * */
	@DeleteMapping(value = "/deleteAll")
	public void deleteAllEmployee() {
		employeeService.deleteAllEmployee();
	}
	
}//class
