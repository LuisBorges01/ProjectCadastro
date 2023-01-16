package br.com.lsborges.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lsborges.Entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
