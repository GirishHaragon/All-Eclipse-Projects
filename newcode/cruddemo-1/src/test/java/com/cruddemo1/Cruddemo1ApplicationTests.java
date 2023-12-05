package com.cruddemo1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo1.entities.Student1; 
import com.cruddemo1.repository.StudentRepository1;

@SpringBootTest
class Cruddemo1ApplicationTests {

	@Autowired
	private StudentRepository1 studentRepo;
	
	@Test
	void saveStudent() {
		Student1 s = new Student1();
		s.setName("Mike");
		s.setCourse("Java Developer Course");
		s.setFee(20000);
		studentRepo.save(s);
	}
}