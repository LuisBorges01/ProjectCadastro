package br.com.lsborges.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsborges.Entity.Person;
import br.com.lsborges.Service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;
	
	@PostMapping
	public Person create(@RequestBody Person person) {
		return personService.create(person);
	}
	
	@GetMapping("/{id}")
	public Optional<Person> findById(@PathVariable("id")Long id) {
		return personService.findById(id);
	}
	
	@GetMapping
	public List<Person> findAll() {
		return personService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delet(@PathVariable("id") Long id) {
		personService.delete(id);
	}
}

