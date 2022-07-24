package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.lti.entity.Student;
import com.lti.entity.EducationDetails;

@Component
public class StudentEducationDetailsDaoImpl implements StudentEducationDetailsDao{

	@PersistenceContext
	EntityManager em;
	

	@Transactional
	public Student addOrUpdateStudent(Student student) {
		Student StudentPersisted = em.merge(student);
		return StudentPersisted;
	}

	public Student searchStudentById(int studentId) {
		return em.find(Student.class, studentId);
	}
	
	public EducationDetails addOrUpdateEducationDetails(EducationDetails educationdetails) {
		EducationDetails educationdetails11 = em.merge(educationdetails);
		return educationdetails11;
	}
	
	public EducationDetails getEducationDetailsByStudentId(int studentId) {
		String jpql="Select ed from EducationDetails ed where ed.studentId=:sid";
		TypedQuery<EducationDetails> query = em.createQuery(jpql, EducationDetails.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();

        }
}
