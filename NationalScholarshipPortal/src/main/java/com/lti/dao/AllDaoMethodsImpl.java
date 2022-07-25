package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.BankDetails;
import com.lti.entity.EducationDetails;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.Student;
import com.lti.entity.StudentDocuments;
import com.lti.entity.StudentFamily;

public class AllDaoMethodsImpl implements AllDaoMethods {

	EntityManagerFactory emf;
	EntityManager em;
	EntityTransaction tx;

	public AllDaoMethodsImpl() {
		emf = Persistence.createEntityManagerFactory("oracle-pu");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	// Student Entity --tested
	@Transactional
	public Student addOrUpdateStudent(Student student) {
		tx.begin();
		Student StudentPersisted = em.merge(student);
		tx.commit();
		return StudentPersisted;
	}

	public Student searchStudentById(int studentId) {
		return em.find(Student.class, studentId);
	}

	// EducationDetails Entity --tested
	@Transactional
	public EducationDetails addOrUpdateEducationDetails(EducationDetails educationDetails) {
		tx.begin();
		EducationDetails educationDetailsPersisted = em.merge(educationDetails);
		tx.commit();
		return educationDetailsPersisted;
	}

	public EducationDetails searchEducationDetailsById(int educationDetailsId) {
		return em.find(EducationDetails.class, educationDetailsId);
	}

	public EducationDetails searchEducationDetailsByStudentId(int studentId) {
		String jpql = "Select ed from EducationDetails ed where ed.student.studentId=:sid";
		TypedQuery<EducationDetails> query = em.createQuery(jpql, EducationDetails.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();
	}

	// BankDetails Entity --tested
	@Transactional
	public BankDetails addOrUpdateBankDetails(BankDetails bankDetails) {
		tx.begin();
		BankDetails bankDetailsPersisted = em.merge(bankDetails);
		tx.commit();
		return bankDetailsPersisted;
	}

	public BankDetails searchBankDetailsById(int bankDetailsId) {
		return em.find(BankDetails.class, bankDetailsId);
	}

	public BankDetails searchBankDetailsByStudentId(int studentId) {
		String jpql = "Select bd from BankDetails bd where bd.student.studentId=:sid";
		TypedQuery<BankDetails> query = em.createQuery(jpql, BankDetails.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();
	}

	// StudentFamily Entity --tested
	@Transactional
	public StudentFamily addOrUpdateStudentFamily(StudentFamily studentFamily) {
		tx.begin();
		StudentFamily studentFamilyPersisted = em.merge(studentFamily);
		tx.commit();
		return studentFamilyPersisted;
	}

	public StudentFamily searchStudentFamilyById(int studentFamilyId) {
		return em.find(StudentFamily.class, studentFamilyId);
	}

	public StudentFamily searchStudentFamilyByStudentId(int studentId) {
		String jpql = "Select bd from StudentFamily bd where bd.student.studentId=:sid";
		TypedQuery<StudentFamily> query = em.createQuery(jpql, StudentFamily.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();
	}

	// StudentDocuments Entity --tested
	@Transactional
	public StudentDocuments addOrUpdateStudentDocuments(StudentDocuments studentDocuments) {
		tx.begin();
		StudentDocuments studentDocumentsPersisted = em.merge(studentDocuments);
		tx.commit();
		return studentDocumentsPersisted;
	}

	public StudentDocuments searchStudentDocumentsById(int studentDocumentsId) {
		return em.find(StudentDocuments.class, studentDocumentsId);
	}

	public StudentDocuments searchStudentDocumentsByStudentId(int studentId) {
		String jpql = "Select bd from StudentDocuments bd where bd.student.studentId=:sid";
		TypedQuery<StudentDocuments> query = em.createQuery(jpql, StudentDocuments.class);
		query.setParameter("sid", studentId);
		return query.getSingleResult();
	}

	// ScholarshipApplication
	@Transactional
	public ScholarshipApplication addOrUpdateScholarshipApplication(ScholarshipApplication application) {
		tx.begin();
		ScholarshipApplication scholarshipApplicationPersisted = em.merge(application);
		tx.commit();
		return scholarshipApplicationPersisted;
	}

	public ScholarshipApplication searchScholarshipApplicationById(int applicationId) {
		return em.find(ScholarshipApplication.class, applicationId);
	}

	public List<ScholarshipApplication> searchScholarshipApplicationByStudentId(int studentId) {
		String jpql = "Select bd from ScholarshipApplication bd where bd.student.studentId=:sid";
		TypedQuery<ScholarshipApplication> query = em.createQuery(jpql, ScholarshipApplication.class);
		query.setParameter("sid", studentId);
		return query.getResultList();
	}

	public ScholarshipApplication searchScholarshipApplicationByStudentIdAndType(int studentId,
			ScholarshipType scholarsipId) {
		return null;
	}

	// ApplicationStatus
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

	// Institute Entity
	@Transactional
	public Institute addOrUpdateInstitute(Institute institute) {
		Institute institutePersisted = em.merge(institute);
		return institutePersisted;
	}

	public Institute searchInstituteById(int instituteId) {
		return em.find(Institute.class, instituteId);
	}

}
