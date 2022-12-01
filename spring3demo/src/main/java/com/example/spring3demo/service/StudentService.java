package com.example.spring3demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.spring3demo.entity.Student;

@Component
public interface StudentService {
	
	Student PostStudent(Student s);
	Student	getStudent(int id);
	List<Student> getAllStudents();
	Student updateStudent(Student Params,int id);
	String deleteStudent(int id);

}
