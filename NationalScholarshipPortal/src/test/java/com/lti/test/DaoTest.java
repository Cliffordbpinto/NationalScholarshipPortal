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
import com.lti.entity.BankDetails;
import com.lti.entity.DisabilityStatus;
import com.lti.entity.EducationDetails;
import com.lti.entity.EntranceExamType;
import com.lti.entity.ScholarshipApplication;
import com.lti.entity.Student;
import com.lti.entity.StudentDocuments;
import com.lti.entity.StudentFamily;

public class DaoTest {

	AllDaoMethods dao = new AllDaoMethodsImpl();

	// Student Entity
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
	
	// EducationDetails Entity
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
	public void searchEducationDetailsByIdTest() {
		EducationDetails ed = dao.searchEducationDetailsById(100003);
		assertNotNull(ed);
	}

	@Test
	public void searchEducationDetailsByStudentIdTest() {
		EducationDetails ed = dao.searchEducationDetailsByStudentId(10023);
		System.out.println(ed.geteExam());
		assertNotNull(ed);
	}
	
	//BankDetails Entity
	@Test
	public void addOrUpdateBankDetailsTest() {
		BankDetails bd = new BankDetails();
		bd.setAccountNo(1237879312);
		bd.setHolderName("holder name");
		bd.setIfscCode("jsdkf");
		bd.setStudent(dao.searchStudentById(10023));
		
		assertNotNull(dao.addOrUpdateBankDetails(bd));
	}
	
	@Test 
	public void searchBankDetailsByIDTest() {
		assertNotNull(dao.searchBankDetailsById(100001));
	}
	
	@Test
	public void searchBankDetailsByStudentIdTest() {
		assertNotNull(dao.searchBankDetailsByStudentId(10023));
	}
	
	//StudentFamliy
	@Test
	public void addOrUpdateStudentFamilyTest() {
		StudentFamily sf = new StudentFamily();
		sf.setFatherName("fatherName");
		sf.setMotherName("motherName");
		sf.setFatherOccupation("fOccu");
		sf.setMotherOccupation("MOccu");
		sf.setFatherAadhaarNo("fAadhar");
		sf.setMotherAadhaarNo("MAadhar");
		sf.setAnnualIncome(7000000.0);
		sf.setStudent(dao.searchStudentById(10023));
		assertNotNull(dao.addOrUpdateStudentFamily(sf));
	}
	@Test
	public void searchStudentFamilyByIdTest() {
		assertNotNull(dao.searchStudentFamilyById(801));
	}
	@Test
	public void searchStudentFamilyByStudentIdTest() {
		assertNotNull(dao.searchStudentFamilyByStudentId(10023));
	}
	
	// StudentDocuments Entity
	@Test
	public void addOrUpdateStudentDocumentsTest() {
		StudentDocuments sd = new StudentDocuments();
		sd.setAadharCard("PAadhar");
		sd.setCasteOrIncomeCertificate("Income");
		sd.setDomecile("domecile");
		sd.setFeeReciept("feeReciept");
		sd.setIdCard("id");
		sd.setPassBook("passbook");
		sd.setPhoto("photo");
		sd.setTenthMarksheet("tenth");
		sd.setTwelfthMarksheet("twelft");
		sd.setStudent(dao.searchStudentById(10023));
		assertNotNull(dao.addOrUpdateStudentDocuments(sd));
	}
	@Test
	public void searchStudentDocumentsByIdTest() {
		assertNotNull(dao.searchStudentDocumentsById(801));
	}
	@Test
	public void searchStudentDocumentsByStudentIdTest() {
		assertNotNull(dao.searchStudentDocumentsByStudentId(10023));
	}
	
	// ScholarshipApplication Entity
	@Test
	public void addOrUpdateScholarshipApplicationTest() {
		ScholarshipApplication sa = new ScholarshipApplication();
		sa.setCaste("caste");
		sa.setReligion("religion");
		sa.setDateApplied(LocalDate.now());
		sa.setDisabilityStatus(DisabilityStatus.AIDP);
		sa.setStudent(dao.searchStudentById(10023));
		assertNotNull(dao.addOrUpdateScholarshipApplication(sa));
	}
	@Test
	public void searchScholarshipApplicationByIdTest() {
		assertNotNull(dao.searchScholarshipApplicationById(10001));
	}
	@Test
	public void searchScholarshipApplicationByStudentId() {
		assertNotNull(dao.searchScholarshipApplicationByStudentId(10023));
	}
//	@Test
//	public void searchScholarshipApplicationByStudentIdAndType() {
//		assertNotNull(dao.searchScholarshipApplicationByStudentIdAndType(10023, Scho))
//	}
	
}
