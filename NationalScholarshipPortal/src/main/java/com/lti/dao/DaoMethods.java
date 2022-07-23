package com.lti.dao;

import java.util.List;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.Student;

public interface DaoMethods {

//	Student addOrUpdateStudent(Student student);
//	//ScholarshipApplication checkStatusOfApplication();
//	ScholarshipApplication applyOrUpdateScholarshipApplication();
//	Student searchStudentById(int studentId);
//	
//	Institute addOrUpdateInstitute( Institute institute);
//	Institute searchInstituteById(int instituteId);
//	//List<ScholarshipApplication> getListOfScholarshipApplicationsIns(int instituteId); prag
//	List<Student> getStudentsByInstituteID(int instituteId);
//	
//	//ScholarshipApplication approveOrRejectApplication(int applicationId);
//	
//	ScholarshipApplication getScholarshipApplicationByStudentIdAndType(int studentId, ScholarshipType type);
//	ApplicationStatus getApplicationStausByApplicationId(int applicationId);
//	ApplicationStatus addOrUpdateApplicationStatus(ApplicationStatus applicationStatus);
	
	ApplicationStatus addorUpdateApplicationStatus(ApplicationStatus applicationStatus);
	
	ApplicationStatus searchApplicationStatusByApplicationId(int applicationId);
	
}
