package org.demo.service;

import org.demo.entity.Person;
import org.demo.repository.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonDAO dao;
	
	//Post
	public Person savePerson(Person person) {
		return dao.save(person);
	}
	
	//Get
	public Iterable<Person> getPersons(){
		return dao.findAll();
	}
	
	//Get
	public Person getPersonById(Integer id) {
		return dao.findById(id).orElse(null);
	}
}
