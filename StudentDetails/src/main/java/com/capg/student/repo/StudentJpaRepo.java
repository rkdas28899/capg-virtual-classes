package com.capg.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.student.model.Student;

public interface StudentJpaRepo extends JpaRepository<Student, Integer> {

	@Query("from Student where studentName=:studentName")
	public Student checkByName(String studentName);
}
