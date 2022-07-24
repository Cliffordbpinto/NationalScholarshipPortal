package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.EducationDetails;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.Student;
import com.lti.entity.StudentFamily;

@Component
public class DaoMethodImpl implements DaoMethods{

	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public ApplicationStatus addorUpdateApplicationStatus(ApplicationStatus applicationStatus) {
		ApplicationStatus ASPersisted = em.merge(applicationStatus);
		return ASPersisted;
	}

	public ApplicationStatus searchApplicationStatusByApplicationId(int applicationId) {
		String jpql = "select astatus from ApplicationStatus astatus where astatus.applicationId=:appid";
		return em.createQuery(jpql,ApplicationStatus.class).setParameter("appid", applicationId).getSingleResult();
	}
	
	public StudentFamily getFamilyDetailsByStudentId(int studentId) {
		String jpql="Select f from StudentFamily f where f.studentId=:sid";
		TypedQuery<StudentFamily> query = em.createQuery(jpql, StudentFamily.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();
	}

	@Transactional
	public Institute addOrUpdateInstituteDetails(Institute institute) {
		Institute institute2 = em.merge(institute);
		return institute2;
	}

	public List<ScholarshipApplication> viewAllApplicationsByInstituteIdAndType(int instituteId, ScholarshipType type) {
		// TODO Auto-generated method stub
		return null;
	}

	public ApplicationStatus getApplicationStatusByApplicationId(int applicationId) {
		return null;
	}

	public ApplicationStatus updateApplicationStatusById(int applicationId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ScholarshipApplication> viewAllInstituteApplications(int instituteId) {
		// TODO Auto-generated method stub
		return null;
	}
	
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
	
	@Transactional
	public Institute addOrUpdateInstitute(Institute institute) {
		Institute institutePersisted= em.merge(institute);
		return institutePersisted;
	}

	public Institute searchInstituteById(int instituteId) {
		return em.find(Institute.class, instituteId);
	
	}

}
