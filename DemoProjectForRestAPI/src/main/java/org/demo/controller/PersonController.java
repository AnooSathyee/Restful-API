package org.demo.controller;

import org.demo.entity.Person;
import org.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired //automatically injects the dependent class/object
	private PersonService service;
	
	@PostMapping("/addPerson") // to create or insert record in the db
	public Person addPerson(@RequestBody Person person) {
		return service.savePerson(person);
	}
	
	@GetMapping("/personDetails")
	public Iterable<Person> getPersonDetails(){
		return service.getPersons();
	}
	
	@GetMapping("/person/{pno}")
	public Person findPersonById(@PathVariable("pno") Integer id) {
		return service.getPersonById(id);
	}

}
