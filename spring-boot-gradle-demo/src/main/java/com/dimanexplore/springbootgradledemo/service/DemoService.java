package com.dimanexplore.springbootgradledemo.service;

import java.util.List;
import java.util.Optional;

import com.dimanexplore.springbootgradledemo.model.Author;
import com.dimanexplore.springbootgradledemo.model.Book;
import com.dimanexplore.springbootgradledemo.model.Project;

public interface DemoService {
	
	List<Project> getAllProjects();
	
	List<Author> getAllAuthors();
	
	Optional<Author> getAuthorByLastName(String lastName);
	
	List<Book> getBooksByAuthor(String lastName);
	
	List<Project> getPersonProjects(String name);
}
