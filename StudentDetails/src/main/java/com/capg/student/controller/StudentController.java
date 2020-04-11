package com.capg.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.student.model.Student;
import com.capg.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService  service;
	
	@GetMapping("/studentName/{studentName}")
	public Student getStudent(@PathVariable String studentName) {
		return service.getStudentByStudentName(studentName);
	}
	
	@GetMapping("/student")
	public List<Student>  getAllStudent()
	{
		  return service.getAllStudent();
	}
	
	@PostMapping("/add")
	public Student createStudent(@RequestBody Student student)
	{
		return  service.saveStudent(student);
	}
	
	@DeleteMapping("/student/{studentName}")
	public Boolean deleteUser(@PathVariable String studentName)
	{
		return service.deleteStudent(studentName);
	}
	
	@PutMapping("/student")
	public Student updateUser(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
}
