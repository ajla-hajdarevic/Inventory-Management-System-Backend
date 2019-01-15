package com.example.pokusaj100.repository;

import com.example.pokusaj100.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {}
