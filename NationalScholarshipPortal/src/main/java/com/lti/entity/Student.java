package com.lti.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "nsp_student")
public class Student {

	@Id
	@SequenceGenerator(name = "stud_seq", initialValue = 10000, allocationSize = 1)
	@GeneratedValue(generator = "stud_seq", strategy = GenerationType.SEQUENCE)
	int studentId;

	String email;
	String password;
	int aadharNo;
	String stateofDomicile;
	String name;
	LocalDate dob;
	String gender;
	int phoneNumber;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	BankDetails bankDetails;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	EducationDetails educationDetails;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	StudentFamily studentFamily;
	
	@ManyToOne
	@JoinColumn(name="instituteId")
	Institute institute;
	
	@OneToMany(mappedBy="student", cascade = CascadeType.ALL)
	List<ScholarshipApplication> scholarshipApplications;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getStateofDomicile() {
		return stateofDomicile;
	}

	public void setStateofDomicile(String stateofDomicile) {
		this.stateofDomicile = stateofDomicile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BankDetails getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}

	public EducationDetails getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(EducationDetails educationDetails) {
		this.educationDetails = educationDetails;
	}

	public StudentFamily getStudentFamily() {
		return studentFamily;
	}

	public void setStudentFamily(StudentFamily studentFamily) {
		this.studentFamily = studentFamily;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}

	public List<ScholarshipApplication> getScholarshipApplications() {
		return scholarshipApplications;
	}

	public void setScholarshipApplications(List<ScholarshipApplication> scholarshipApplications) {
		this.scholarshipApplications = scholarshipApplications;
	}

	
		
}
