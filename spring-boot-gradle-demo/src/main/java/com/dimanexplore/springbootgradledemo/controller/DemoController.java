package com.dimanexplore.springbootgradledemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimanexplore.springbootgradledemo.model.Author;
import com.dimanexplore.springbootgradledemo.model.Book;
import com.dimanexplore.springbootgradledemo.model.Project;
import com.dimanexplore.springbootgradledemo.service.DemoService;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
	
	private DemoService demoService;
	
	@Autowired
	public DemoController(DemoService demoService) {
		this.demoService = demoService;
	}
	
	@GetMapping(value = "/author/")
	public List<Author> getAuthors(){
		return demoService.getAllAuthors();
	}
	
	@GetMapping(value = "/author/{lastName}/")
	public Optional<Author> getAuthor(@PathVariable(name = "lastName") String lastName){
		return demoService.getAuthorByLastName(lastName);
	}
	
	@GetMapping(value = "/author/{lastName}/books")
	public List<Book> getAuthorBooks(@PathVariable(name = "lastName") String lastName){
		return demoService.getBooksByAuthor(lastName);
	}
	
	@GetMapping(value = "/project/")
	public List<Project> getProjects(){
		return demoService.getAllProjects();
	}
	
	@GetMapping(value = "/person/{name}/projects")
	public List<Project> getPersonProjects(@PathVariable(name = "name") String name){
		return demoService.getPersonProjects(name);
	}
	

}
