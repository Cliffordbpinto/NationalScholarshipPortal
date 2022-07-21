package com.lti.dao;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudents();

	public Optional<Student> getStudent(int id);

	public void saveStudent(Student s);

	public void updateStudentDetail(int id, Student s);

	public void deleteStudent(int id);

}
