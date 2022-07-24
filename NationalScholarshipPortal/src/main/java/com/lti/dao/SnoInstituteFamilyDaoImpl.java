package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.type.descriptor.sql.JdbcTypeFamilyInformation.Family;
import org.springframework.stereotype.Component;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.StudentFamily;

@Component
public class SnoInstituteFamilyDaoImpl implements SnoInstituteFamilyDao {
	
	@PersistenceContext
	EntityManager em;

	@Transactional
	public StudentFamily addOrUpdateFamilyDetails(StudentFamily family) {
		return em.merge(family);
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

}
