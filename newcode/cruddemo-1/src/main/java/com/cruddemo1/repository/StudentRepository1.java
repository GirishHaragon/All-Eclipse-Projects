package com.cruddemo1.repository;

import org.springframework.data.repository.CrudRepository;

import com.cruddemo1.entities.Student1;

public interface StudentRepository1 extends CrudRepository<Student1, Integer> {
	
}