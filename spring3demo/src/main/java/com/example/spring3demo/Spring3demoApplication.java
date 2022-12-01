package com.example.spring3demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring3demo.entity.Student;
import com.example.spring3demo.repository.StudentRepository;



@SpringBootApplication
public class Spring3demoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring3demoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = Student.builder().name("mahesh").email("a@Gmail.com").build();
		Student student2 = Student.builder().name("mamta").email("m@Gmail.com").build();
		Student student3 = Student.builder().name("khusbu").email("k@Gmail.com").build();
		Student student4 = Student.builder().name("manisha").email("mn@Gmail.com").build();

		studentRepository.save(student);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		System.out.println("-----------------students saved---------------------");

	}

}