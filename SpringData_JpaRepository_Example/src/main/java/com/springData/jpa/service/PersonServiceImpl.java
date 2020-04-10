package com.springData.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springData.jpa.model.Person;
import com.springData.jpa.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepo;

	@Override
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}

	@Override
	public List<Person> getAllPersons() {
		return personRepo.findAll();
	}
	
	@Override
	public Person updatePerson(Person person) {
		return personRepo.save(person);
	}
	
	@Override
	public Person getPerson(int id) {
		return personRepo.getOne(id);
	}

	@Override
	public void deletePerson(Person person) {
		personRepo.delete(person);
	}

	@Override
	public void deletePerson(int id) {
		personRepo.deleteById(id);
	}

	@Override
	public long countPersons() {
		return personRepo.count();
	}

	@Override
	public List<Person> findByPersonsAge(int age) {
		return personRepo.findByAge(age);
	}
	
	@Override
	public List<Person> findDetailsByName(String name) {
		return personRepo.findByName(name);
	}
	
	@Override
	public List<Person> retrieveByPersonName(String name) {
		return personRepo.retrieveByPersonName(name);
	}
}//class
