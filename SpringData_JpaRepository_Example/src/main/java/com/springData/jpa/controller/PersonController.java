package com.springData.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springData.jpa.model.Person;
import com.springData.jpa.service.PersonService;

@RestController
@RequestMapping(value = "/person",produces = MediaType.APPLICATION_JSON_VALUE)
class PersonController {
	
	@Autowired
	private PersonService personService;
	
	/* POST
	 * http://localhost:8080/person/addPerson
	 * {
	    "name":"Raja Babu",
	    "age":"23"
       }*/
	@PostMapping(value = "/addPerson")
	public Person createPerson(@RequestBody Person person) {
		return personService.createPerson(person);
	}
	
	/* GET
	 * http://localhost:8080/person/persons
	 * */
	@GetMapping(value = "/persons")
	public List<Person> findAllPerson() {
		return personService.getAllPersons();
	}
	
	/* PUT
	 * http://localhost:8080/person/updateDetails
	 * {   "id":"17"
	       "name":"RRRK",
	       "age":"23"
       }
    */
	@PutMapping(value = "/updateDetails")
	public Person updatePersonDetails(Person person) {
		return personService.updatePerson(person);
	}
	
	/* GET
	 * http://localhost:8080/person/getPerson/16
	 *  */
	@GetMapping(value = "/getPerson/{id}")
	public Person getPersonById(@PathVariable int id) {
		return personService.getPerson(id);
	}
	
	/* DELETE
	 * http://localhost:8080/person/deletePerson
	 * {
        "id": 8,
        "name": "Mahesh Babu",
        "age": 45
       }
	 * */
	@DeleteMapping(value = "/deletePerson")
	public void deletePerson(@RequestBody Person person) {
		personService.deletePerson(person);
	}
	
	/* DELETE
	 * http://localhost:8080/person/deletePerson/17
	 * */
	@DeleteMapping(value = "/deletePerson/{id}")
	public void deletePerson(@PathVariable int id) {
		personService.deletePerson(id);
	}
	
	/* GET
	 * http://localhost:8080/person/countPersons 
	 * */
	@GetMapping(value = "/countPersons")
	public long countPersons() {
		return personService.countPersons();
	}
	
	/* GET
	 * http://localhost:8080/person/findPerson/23
	 * */
	@GetMapping(value = "/findPerson/{age}")
	public List<Person> findPersonByAge(@PathVariable int age){
		return personService.findByPersonsAge(age);
	}
	
	/* GET
	 * http://localhost:8080/person/findDetails/Raja Kumar
	 * */
	@GetMapping(value = "/findDetails/{name}")
	public List<Person> findDetailsByName(@PathVariable String name){
		return personService.findDetailsByName(name);
	}
	
	/* GET
	 * http://localhost:8080/person/retrieveByPersonName/Raja
	 * */
	@GetMapping(value = "/retrieveByPersonName/{name}")
	public List<Person> retrieveByPersonName(@PathVariable String name){
		return personService.retrieveByPersonName(name);
	}
	
}//class
