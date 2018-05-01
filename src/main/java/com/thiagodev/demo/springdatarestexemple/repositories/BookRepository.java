package com.thiagodev.demo.springdatarestexemple.repositories;

import com.thiagodev.demo.springdatarestexemple.models.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
