package com.springData.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springData.crud.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	Employee findByLastName(String lastName);
	
	List<Employee> findAll();
	
	@Query("SELECT e FROM Employee e WHERE e.lastName=:lastName AND e.address=:address")
	Employee findByLastNameAndAddress(@Param("lastName") String lastName,@Param("address") String address);
}
