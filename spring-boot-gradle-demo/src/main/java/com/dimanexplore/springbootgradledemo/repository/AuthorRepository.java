package com.dimanexplore.springbootgradledemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dimanexplore.springbootgradledemo.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
	
	public Optional<Author> findByLastName(String lastName);
}
