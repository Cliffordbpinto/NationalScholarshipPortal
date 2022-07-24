package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.BankDetails;
import com.lti.entity.EducationDetails;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.Student;
import com.lti.entity.StudentDocuments;
import com.lti.entity.StudentFamily;

@Component
public class AllDaoMethodsImpl implements AllDaoMethods {
	
	@PersistenceContext
	EntityManager em;

	//Student Entity
	@Transactional
	public Student addOrUpdateStudent(Student student) {
		Student StudentPersisted = em.merge(student);
		return StudentPersisted;
	}
	public Student searchStudentById(int studentId) {
		return em.find(Student.class, studentId);
	}

	
	//EducationDetails Entity
	@Transactional
	public EducationDetails addOrUpdateEducationDetails(EducationDetails educationDetails) {
		EducationDetails educationDetailsPersisted = em.merge(educationDetails);
		return educationDetailsPersisted;
	}
	public EducationDetails searchEducationDetailsById(int educationDetailsId) {
		return em.find(EducationDetails.class, educationDetailsId);
	}
	public EducationDetails searchEducationDetailsByStudentId(int studentId) {
		String jpql="Select ed from EducationDetails ed where ed.studentId=:sid";
		TypedQuery<EducationDetails> query = em.createQuery(jpql, EducationDetails.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();
	}

	
	//BankDetails Entity
	@Transactional
	public BankDetails addOrUpdateBankDetails(BankDetails bankDetails) {
		BankDetails bankDetailsPersisted = em.merge(bankDetails);
		return bankDetailsPersisted;
	}
	public BankDetails searchBankDetailsByID(int bankDetailsId) {
		return em.find(BankDetails.class, bankDetailsId);
	}
	public BankDetails searchBankDetailsByStudentId(int studentId) {
		return null;
	}

	
	//StudentFamily Entity
	@Transactional
	public StudentFamily addOrUpdateStudentFamily(StudentFamily studentFamily) {
		StudentFamily studentFamilyPersisted = em.merge(studentFamily);
		return studentFamilyPersisted;
	}
	public StudentFamily searchStudentFamilyById(int studentFamilyId) {
		return em.find(StudentFamily.class, studentFamilyId);
	}
	public StudentFamily searchStudentFamilyByStudentId(int studentId) {
		return null;
	}
	
	
	//StudentDocuments Entity
	@Transactional
	public StudentDocuments addOrUpdateStudentDocuments(StudentDocuments studentDocuments) {
		StudentDocuments studentDocumentsPersisted = em.merge(studentDocuments);
		return studentDocumentsPersisted;
	}
	public StudentDocuments searchStudentDocumentsById(StudentDocuments studentDocumentsId) {
		return em.find(StudentDocuments.class, studentDocumentsId);
	}
	public StudentDocuments searchStudentDocumentsByStudentId(int studentId) {
		return null;
	}

	
	//ScholarshipApplication
	@Transactional
	public ScholarshipApplication addOrUpdate(ScholarshipApplication application) {
		ScholarshipApplication scholarshipApplicationPersisted = em.merge(application);
		return scholarshipApplicationPersisted;
	}
	public ScholarshipApplication searchScholarshipApplicationById(int applicationId) {
		return em.find(ScholarshipApplication.class, applicationId);
	}
	public List<ScholarshipApplication> searchScholarshipApplicationByStudentId(int studentId) {
		return null;
	}
	public ScholarshipApplication searchScholarshipApplicationByStudentIdAndType(int studentId,
			ScholarshipType scholarsipId) {
		return null;
	}

	
	//ApplicationStatus
	@Transactional
	public ApplicationStatus addOrUpdateApplicationStatus(ApplicationStatus applicationStatus) {
		ApplicationStatus applicationStatusPersisted = em.merge(applicationStatus);
		return applicationStatusPersisted;
	}
	public ApplicationStatus searchApplicationStatusById(int applicationStatusId) {
		return em.find(ApplicationStatus.class, applicationStatusId);
	}
	public ApplicationStatus searchApplicationStatusByApplicationId(int applicationId) {
		return null;
	}

	
	//Institute Entity
	@Transactional
	public Institute addOrUpdateInstitute(Institute institute) {
		Institute institutePersisted = em.merge(institute);
		return institutePersisted;
	}
	public Institute searchInstituteById(int instituteId) {
		return em.find(Institute.class, instituteId);
	}

}
