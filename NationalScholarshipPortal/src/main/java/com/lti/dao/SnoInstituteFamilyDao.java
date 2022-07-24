package com.lti.dao;

import java.util.List;

import com.lti.entity.ApplicationStatus;
import com.lti.entity.Institute;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.ScholarshipType;
import com.lti.entity.StudentFamily;

public interface SnoInstituteFamilyDao {
	StudentFamily addOrUpdateFamilyDetails(StudentFamily family);
	
	StudentFamily getFamilyDetailsByStudentId(int studentId);
	
	Institute addOrUpdateInstituteDetails(Institute institute);
	
	List<ScholarshipApplication> viewAllApplicationsByInstituteIdAndType(int instituteId, ScholarshipType type);
	
	ApplicationStatus getApplicationStatusByApplicationId(int applicationId);
	
	ApplicationStatus updateApplicationStatusById(int applicationId);
	
	List<ScholarshipApplication> viewAllInstituteApplications(int instituteId);
	
	
}
