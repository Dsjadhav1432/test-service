package com.example.test.testservice.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.testservice.entity.Student;
import com.example.test.testservice.service.TestService;

	
	@RestController
public class testController {
	
	@org.springframework.beans.factory.annotation.Autowired
	TestService testService;
	
/*	@GetMapping("/get-text")
	public List<String> getText() {
		return testService.getText();
		
	}
	@PostMapping("/add-text")
	public String addText(@RequestParam String text) {
		return testService.addText(text);
		
	}
	@PutMapping("/update-text")
	public String updateText(@RequestParam int pos, @RequestParam String text) {
		return testService.updateText(pos,text);
	}
	@DeleteMapping("/delete-text")
	public String deleteText(@RequestParam int pos) {
		return testService.deleteText(pos);
	}*/
	@PostMapping("/add-student")
	public String  addStudent(@RequestBody Student student) {
		return testService.addStudent(student);
		
	}
	@GetMapping("/get-students")
	public Object getStudents() {
		return testService.getStudentS();
		
	}
	@GetMapping("/get-student-byrollno")
	public Object getStudent(@RequestParam int rollno) {
		return testService.getStudent(rollno);
		
	}
	@PutMapping("/uptate-student")
	public String updateStudent(@RequestBody Student student) {
		return testService.updateStudent(student);
		
	}
	@DeleteMapping("/delete-student-byrollno")
	public String deleteStudent(@RequestParam int rollno) {
		return testService.deleteStudent(rollno);
		
	}

}
