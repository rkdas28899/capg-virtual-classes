package com.capg.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.student.exceptions.StudentNotFoundException;
import com.capg.student.model.Student;
import com.capg.student.repo.StudentJpaRepo;
import com.capg.student.repo.StudentRepo;



@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	@Autowired
	StudentJpaRepo jpaRepo;
	
	@Transactional
	public Student saveStudent(Student student) {
		repo.saveStudent(student);
		return getStudentByStudentName(student.getStudentName());
	}

	public Student getStudentByStudentName(String studentName) {
		Student student = jpaRepo.checkByName(studentName);
		if(student==null) {
			throw new StudentNotFoundException("Student Not Found with Student Name : ["+studentName+"]");
		}
		return student;
	}
	
	public List<Student> getAllStudent(){
		return jpaRepo.findAll();
	}
	
	public boolean deleteStudent(String studentName) {
		Student student=jpaRepo.checkByName(studentName);
		if(student==null) {
			throw new StudentNotFoundException("No Student found with Student Name : "+studentName);
		}
		jpaRepo.delete(student);
		return jpaRepo.checkByName(studentName)==null;
	}

	public Student updateStudent(Student newStudent) {
		Student oldStudent=jpaRepo.checkByName(newStudent.getStudentName());
		if(oldStudent==null) {
			throw new StudentNotFoundException("No Student found with Student Name : "+newStudent.getStudentName());
		}
		oldStudent.setStudentName(newStudent.getStudentName());
		oldStudent.setDob(newStudent.getDob());
		return jpaRepo.save(oldStudent);
	}

}

