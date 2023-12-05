package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {

	@Autowired
	private StudentRepository studentRepo;
	
	@Test
	void saveStudent() {//This saveStudent is working even if we have different name of Table in DB. For eg- Student1 table name in DB and this can be saveStudent or saveStudent1
		Student s = new Student();//creating an Entity object.
		s.setName("Mike");
		s.setCourse("Java Development Course");
		s.setFee(20000);
		//Now what we have here is We have an Entity object with Data.
		//The ORM comes to picture here. ORM-take the object contet and move it to table
		//Now this repo layer has a method.
		studentRepo.save(s);
		//Entity Object Content is moved to DB Table, but who is moving it is Repository layer & what is repository layer giving us?=>Save method. Repository is an Interface
		//Interface object is not created, the object created is SimpleJpaRepository (u can see it in the console. Here ClassUpcasting is happening here automatically.
		//Now if we run as Junit then we can see the Contents are pushed inside the DB table.
		//Now All we need to do is remember the steps as beginners,
		//1st we created a SpringBoot Project, While creating it what dependencies we gave => MySQL Driver & SpringDataJPA why bcs it gives us hibernate jars/libraries.
		//2nd we created a Database Schema with a table name student.
		//3rd we Developed Entity Class.
		//4th we Configured application.properties file, why bcs this is where we give DB so that SpBoot will automatically read this file & connect to DB
		//All the above 4 Steps are to do with Hibernate
		//5th Create Repository Layer that we create is to do with Spring Boot, Why r we creating, bcs it'll help us to do CRUD operation on entity object. Like we applied save method. who's giving Save method?=>Repo Layer
	}
	
	@Test
	void deleteOneStudent() {//Now we r about to delete a record based on Student ID
		studentRepo.deleteById(1);//To perform single method run on Junit we can select the method name-deleteonestudent and right click and run as Junit. Then we can check in Mysql the record is erased. If u selct one method and run the only method runs,  if u don't select any & run then all methods run on Junit.
	}
	//After deleting a record if we select the save method & run it then the record will get created again but the ID gets changed to 2, will not be same anymore.
	
	//Now we go to Retrieve a record from DB,,
	@Test
	void getStudentInfo() {
		Optional<Student> findById = studentRepo.findById(2);//The studentRepo.findById(2); will go to the DB & take the Record with ID mentioned, and it will put it into object and stores it into is of the type Optional class, and the object address in stored into findById  
		Student student = findById.get();//This line will convert Optional class object into Entity object Student.
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());
	}
	@Test
	void updateStudent() {//Here we are updating the record based on ID - Primary key. Therefore ID cannot be updated.
		Student s = new Student();
		s.setId(2);//Whenever we update we need to give the unique Parameter then only the update happens to that entire row.
		s.setName("Mike Thyson");
		s.setCourse("Java Development Course with Project");
		s.setFee(20000);
		studentRepo.save(s);
	}
}
//JUnit:-
//@Test is an annotation belongs to JUnit
//JUnit is a unit testing framework, which means testing which is done at coding level
//There are two kinds of testing in Java Dev, they are Black Box testing (Blindly testing the web pages without knowing any code knowledge), and White Box/Unit testing/Transparent testing framework which we are testing after writing our @Test annotation methods of CRUD Operations.  
//Now whatever we did @Test is all Testing happening at code level testing..
//For the explaination of JUnit we will use eclipse.