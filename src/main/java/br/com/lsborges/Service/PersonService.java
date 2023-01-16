package br.com.lsborges.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lsborges.Entity.Person;
import br.com.lsborges.Repository.PersonRepository;

@Service
public class PersonService {
	@Autowired
	private PersonRepository personRepository;
	
	public Person create(Person person) {
		return personRepository.save(person);
	}
	public Optional<Person> findById(Long id) {
		return personRepository.findById(id);
	}
	public List<Person> findAll() {
		return personRepository.findAll();
	}
	
	public void delete(Long id) {
		personRepository.deleteById(id);
	}

}
