package com.thiagodev.demo.springdatarestexemple;

import com.thiagodev.demo.springdatarestexemple.models.Author;
import com.thiagodev.demo.springdatarestexemple.models.Book;
import com.thiagodev.demo.springdatarestexemple.repositories.AuthorRepository;
import com.thiagodev.demo.springdatarestexemple.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@SpringBootApplication
public class SpringDataRestExempleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestExempleApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AuthorRepository authorRepository;

	@PostConstruct
	@Transactional
	public void onLoad(){

		Author alberto = new Author();
		alberto.setName("Alberto");
		authorRepository.save(alberto);

		Author thiago = new Author();
		thiago.setName("Thiago");
		authorRepository.save(thiago);


		Book book = new Book();
		book.setTitle("Spring MVC");
		book.setDescription("Domine o principal framework web Java");
		book.setNumOfPages(237);

		book.add(alberto);
		book.add(thiago);

		bookRepository.save(book);

	}
}
