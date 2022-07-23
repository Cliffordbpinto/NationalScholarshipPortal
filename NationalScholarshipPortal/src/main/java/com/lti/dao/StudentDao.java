package com.lti.dao;

import java.util.List;

import com.lti.entity.Student;

public interface StudentDao {

	Student addOrUpdateStudent(Student student);

	Student searchStudentById(int studentId);



}
