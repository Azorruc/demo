package com.dimanexplore.springbootgradledemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimanexplore.springbootgradledemo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
	
	public Optional<Person> findByName(String name);
}
