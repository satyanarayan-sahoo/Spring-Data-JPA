package com.springData.jpa.service;

import java.util.List;
import com.springData.jpa.model.Person;

public interface PersonService {
	
	public Person createPerson(Person person);
	
	public List<Person> getAllPersons();
	
	public Person updatePerson(Person person); 

    public Person getPerson(int id);

    public void deletePerson(Person person);

    public void deletePerson(int id);

    public long countPersons();
    
    public List<Person> findByPersonsAge(int age);
    
    public List<Person> findDetailsByName(String name);
    
    public List<Person> retrieveByPersonName(String name);
}
