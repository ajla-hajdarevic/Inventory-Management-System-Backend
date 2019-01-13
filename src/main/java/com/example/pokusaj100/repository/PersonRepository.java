package com.example.pokusaj100.repository;

import com.example.pokusaj100.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {}
