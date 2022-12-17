package com.example.test.testservice.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.test.testservice.exception.StudentNotFoundException;

@ControllerAdvice
public class StudentExceptionController {

	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<String> exception(StudentNotFoundException exception){
		return new ResponseEntity<String>("Student not found", HttpStatus.NOT_FOUND);
	}
}
