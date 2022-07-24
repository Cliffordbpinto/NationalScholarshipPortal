package com.lti.dao;

import com.lti.entity.Student;
import com.lti.entity.EducationDetails;

public interface StudentEducationDetailsDao {

	Student addOrUpdateStudent(Student student);

	Student searchStudentById(int studentId);
	
	EducationDetails addOrUpdateEducationDetails(EducationDetails educationdetails);

}
