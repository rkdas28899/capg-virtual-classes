package com.capg.student.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capg.student.model.Student;

@Repository
public class StudentRepo {

	@PersistenceContext
	EntityManager em;
	
	public void saveStudent(Student student) {
		em.persist(student);
		
	}
	
	public Student getStudentById(int id) {
		TypedQuery<Student> q=em.createQuery("from Student where studentName=studentName:",Student.class);
		q.setParameter("id", id);
		Student student=q.getSingleResult();
		return student;
	}
	
	public List<Student> getAllStudent(){
		TypedQuery<Student> q=em.createQuery("from Student",Student.class);
		return q.getResultList();
	}
	
	
}
