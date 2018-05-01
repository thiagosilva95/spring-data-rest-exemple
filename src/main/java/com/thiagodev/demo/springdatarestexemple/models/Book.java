package com.thiagodev.demo.springdatarestexemple.models;

import com.thiagodev.demo.springdatarestexemple.models.Author;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @Setter
    @Min(50)
    private Integer numOfPages;

    @Valid
    @ManyToMany(fetch=FetchType.EAGER)
    private Set<Author> authors = new HashSet<>();

    public void add(Author author) {
        authors.add(author);
    }

}

