package com.capg.student.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Student")
public class Student {
	
	 @Id
	 @Column(name="id")
	 @GeneratedValue
	 private int id;
	  
	 private String studentName;

	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private LocalDate dob;
	 
	 public Student() {
			super();
		}
	 
	 public Student(int id, String studentName, LocalDate dob) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.dob = dob;
	}

	public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 @Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", dob=" + dob + "]";
	}

	public String getStudentName() {
		 return studentName;
	 }

	 public void setStudentName(String studentName) {
		 this.studentName = studentName;
	 }

	 public LocalDate getDob() {
		 return dob;
	 }

	 public void setDob(LocalDate dob) {
		 this.dob = dob;
	 }
}
