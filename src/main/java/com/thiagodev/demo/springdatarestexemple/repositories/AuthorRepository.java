package com.thiagodev.demo.springdatarestexemple.repositories;

import com.thiagodev.demo.springdatarestexemple.models.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
