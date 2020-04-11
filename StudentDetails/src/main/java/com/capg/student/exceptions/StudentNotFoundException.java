package com.capg.student.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Student Not Found", value = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {
public StudentNotFoundException(String message) {
	// TODO Auto-generated constructor stub
	super(message);
}
}

