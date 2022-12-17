package com.example.test.testservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.testservice.entity.Student;
import com.example.test.testservice.exception.StudentNotFoundException;
import com.example.test.testservice.repository.StudentRepository;

@Service
public class TestService {
	
	
	List<String> data= new ArrayList<>();
	@Autowired
	StudentRepository studentRepository;
	public String addText(String text) {
		data.add(text);
		return "text Added Successfully";
		
	}
	public List<String> getText(){
		return data;
		
	}
	public String updateText(int pos, String text) {
		if(pos>data.size()) {
			return "Possion not Available to update";
		}{
			data.set(pos, text);
		}
		return "Text Updated Successfully";
	}
	public String deleteText(int pos) {
		if(pos>data.size()) {
			return "Possion not Available to delete";
		}{
			data.remove(pos);
		}
		return "Text deleted Successfully";
	}
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "Record Save Seccessfully";
		
	}
	public Object getStudentS() {
		List<Student> list = studentRepository.findAll();
		if(list.isEmpty()) 
			return "record not found";
		else
			return list;
	}
	public Object getStudent(int rollno) {
		Student s = studentRepository.findByRollno(rollno);
		if(s==null)
			return "record not found";
		else
		return s;
	}
	public String updateStudent(Student student) {
		try {
		Student s = studentRepository.getOne(student.getRollno());
		studentRepository.save(student);
		return "Record Updated Sucsessfully";
		}catch(Exception e) {
			throw new StudentNotFoundException();
		}
	}
	public String deleteStudent(int rollno) {
		try {
			Student s = studentRepository.getOne(rollno);
			studentRepository.deleteById(rollno);
			return "Record Deleted Sucsessfully";
		}catch(Exception e) {
			return "Record not Found";
		}
	}
	
}
