package com.lti.dao;

import java.util.List;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.BankDetails;
import com.lti.entity.EducationDetails;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.Student;
import com.lti.entity.StudentDocuments;
import com.lti.entity.StudentFamily;

public interface AllDaoMethods {

	//Student Entity
	Student addOrUpdateStudent(Student student);
	Student searchStudentById(int studentId);
	
	//EducationDetails Entity
	EducationDetails addOrUpdateEducationDetails (EducationDetails educationDetails);
	EducationDetails searchEducationDetailsById (int educationDetailsId);
	EducationDetails searchEducationDetailsByStudentId (int studentId);
	
	//BankDetails Entity
	BankDetails addOrUpdateBankDetails(BankDetails bankDetails);
	BankDetails searchBankDetailsById(int bankDetailsId);
	BankDetails searchBankDetailsByStudentId(int studentId);
	
	//StudentFamily Entity
	StudentFamily addOrUpdateStudentFamily(StudentFamily studentFamily);
	StudentFamily searchStudentFamilyById(int studentFamilyId);
	StudentFamily searchStudentFamilyByStudentId(int studentId);
	
	//StudentDocuments Entity
	StudentDocuments addOrUpdateStudentDocuments(StudentDocuments studentDocuments);
	StudentDocuments searchStudentDocumentsById(int studentDocumentsId);
	StudentDocuments searchStudentDocumentsByStudentId(int studentId);
	
	//ScholarshipApplication
	ScholarshipApplication addOrUpdateScholarshipApplication(ScholarshipApplication application);
	ScholarshipApplication searchScholarshipApplicationById (int applicationId);
	List<ScholarshipApplication> searchScholarshipApplicationByStudentId(int studentId);
	ScholarshipApplication searchScholarshipApplicationByStudentIdAndType(int studentId, ScholarshipType scholarsipId);
	
	//ApplicationStatus
	ApplicationStatus addOrUpdateApplicationStatus(ApplicationStatus applicationStatus);
	ApplicationStatus searchApplicationStatusById (int applicationStatusId);
	ApplicationStatus searchApplicationStatusByApplicationId(int applicationId);
	
	//Institute Entity
	Institute addOrUpdateInstitute(Institute institute);
	Institute searchInstituteById(int instituteId);
	
	
	
}
