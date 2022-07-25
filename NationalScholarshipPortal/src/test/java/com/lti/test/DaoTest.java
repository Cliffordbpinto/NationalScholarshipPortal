package com.lti.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.AllDaoMethods;
import com.lti.dao.AllDaoMethodsImpl;
import com.lti.entity.EducationDetails;
import com.lti.entity.EntranceExamType;
import com.lti.entity.Student;

public class DaoTest {

	AllDaoMethods dao = new AllDaoMethodsImpl();

	@Test
	public void addOrUpdateStudent() {
		Student student = new Student();
		student.setEmail("email2");
		student.setPassword("password");
		student.setAadharNo("aadhar");
		student.setStateofDomicile("state");
		student.setName("name");
		student.setDob(LocalDate.now());
		student.setGender("m");
		student.setPhoneNumber("9988776655");
		//System.out.println(student.getAadharNo());
		Student student1 = dao.addOrUpdateStudent(student);
		assertNotNull(student1);
	}
	
	@Test 
	public void searchStudentByIdTest() {
		Student stu = dao.searchStudentById(10023);
		System.out.println(stu.getName());
		assertNotNull(stu);
	}
	
	@Test
	public void addOrUpdateEducationDetailsTest() {
		EducationDetails ed = new EducationDetails();
		ed.setTenthBoard("board");
		ed.setTenthSchool("school");
		ed.setTenthScore("score");
		ed.setTenthYearOfPassing(2016);
		ed.setTwelfthBoard("board");
		ed.setTwelfthCollege("college");
		ed.setTwelfthScore("score");
		ed.setTwelfthYearOfPassing(2019);
		ed.seteExam(EntranceExamType.AIIMS);
		ed.setEntranceExamScore(100);
		ed.setStudent(dao.searchStudentById(10023));
		assertNotNull(dao.addOrUpdateEducationDetails(ed));
	}

	@Test
	public void searchEducationDetailsByStudentIdTest() {
		EducationDetails ed = dao.searchEducationDetailsByStudentId(10023);
		System.out.println(ed.geteExam());
		assertNotNull(ed);
	}
}
