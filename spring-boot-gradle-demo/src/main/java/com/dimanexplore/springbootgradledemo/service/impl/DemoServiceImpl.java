package com.dimanexplore.springbootgradledemo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimanexplore.springbootgradledemo.model.Author;
import com.dimanexplore.springbootgradledemo.model.Book;
import com.dimanexplore.springbootgradledemo.model.Person;
import com.dimanexplore.springbootgradledemo.model.Project;
import com.dimanexplore.springbootgradledemo.repository.AuthorRepository;
import com.dimanexplore.springbootgradledemo.repository.PersonRepository;
import com.dimanexplore.springbootgradledemo.repository.ProjectRepository;
import com.dimanexplore.springbootgradledemo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
	
	private ProjectRepository projectRepository;
	
	private PersonRepository personRepository;
	
	private AuthorRepository authorRepository;
	
	@Autowired
	public DemoServiceImpl(ProjectRepository projectRepository, PersonRepository personRepository, AuthorRepository authorRepository) {
		this.projectRepository = projectRepository;
		this.personRepository = personRepository;
		this.authorRepository = authorRepository;
	}
	
	@Override
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}

	@Override
	public Optional<Author> getAuthorByLastName(String lastName) {
		return authorRepository.findByLastName(lastName);
	}

	@Override
	public List<Book> getBooksByAuthor(String lastName) {
		Optional<Author> author = this.getAuthorByLastName(lastName);
		if(author.isPresent()) {
			 return author.get().getBooks();
		}
		else {
			return null;
		}
	}

	@Override
	public List<Project> getPersonProjects(String name) {
		Optional<Person> person = personRepository.findByName(name);
		if(person.isPresent()) {
			return person.get().getProjects();
		}
		else {
			return null;
		}
	}

}
