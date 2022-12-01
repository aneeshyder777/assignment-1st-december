package com.example.spring3demo.repotest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.spring3demo.entity.Student;
import com.example.spring3demo.repository.StudentRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace =Replace.NONE)
@Rollback(false)
class StudentRepositoryTest {
	
	@Autowired
	private TestEntityManager  testEntityManager;
	
	@Autowired
	private StudentRepository  studentRepository;
	

	@Test
	void testSaveNewStudent() {
	
		testEntityManager.persist(new Student(22,"a","ane@gmail.com"));
		Student s= studentRepository.findById(11).get();
		assertThat(s.getName()) .isEqualTo("a");
	}
	
	@Test
	void testFetchAStudent() {
	
		testEntityManager.persist(new Student(22,"a","ane@gmail.com"));
		Student s= studentRepository.findById(11).get();
		assertThat(s.getEmail()) .isEqualTo("ane@gmail.com");
	}
	
	@Test
	void testUpdateAStudent() {
	
		testEntityManager.persist(new Student(22,"a","ane@gmail.com"));
		Student s= studentRepository.findById(11).get();
		s.setEmail("ane@hotmail.com");
		s.setName("mahesh");
		testEntityManager.persist(s);
		assertThat(s.getEmail()) .isEqualTo("ane@hotmail.com");

}
}
