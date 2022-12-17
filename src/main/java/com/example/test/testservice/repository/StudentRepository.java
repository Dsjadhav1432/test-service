package com.example.test.testservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.testservice.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	Student findByRollno(int rollno);

}
