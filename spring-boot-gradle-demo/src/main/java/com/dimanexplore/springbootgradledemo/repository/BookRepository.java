package com.dimanexplore.springbootgradledemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dimanexplore.springbootgradledemo.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
