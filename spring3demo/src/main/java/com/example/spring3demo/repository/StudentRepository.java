package com.example.spring3demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring3demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
