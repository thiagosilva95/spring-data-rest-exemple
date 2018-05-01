package com.thiagodev.demo.springdatarestexemple.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;
}
