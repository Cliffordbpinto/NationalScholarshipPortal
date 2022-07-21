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

	int aadharNo;
	String stateofDomicile;
	String name;
	LocalDate dob;
	String gender;
	int phoneNumber;
	String email;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	BankDetails bankDetails;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	BankDetails educationDetails;
	
	@OneToOne(mappedBy="student", cascade = CascadeType.ALL)
	BankDetails studentFamily;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;
	
	@ManyToOne
	@JoinColumn(name="instituteId")
	User institute;
	
	@OneToMany(mappedBy="student", cascade = CascadeType.ALL)
	List<ScholarshipApplication> scholarshipApplications;

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	public BankDetails getEducationDetails() {
		return educationDetails;
	}
	public void setEducationDetails(BankDetails educationDetails) {
		this.educationDetails = educationDetails;
	}
	public BankDetails getStudentFamily() {
		return studentFamily;
	}
	public void setStudentFamily(BankDetails studentFamily) {
		this.studentFamily = studentFamily;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getInstitute() {
		return institute;
	}
	public void setInstitute(User institute) {
		this.institute = institute;
	}
	public List<ScholarshipApplication> getScholarshipApplications() {
		return scholarshipApplications;
	}
	public void setScholarshipApplications(List<ScholarshipApplication> scholarshipApplications) {
		this.scholarshipApplications = scholarshipApplications;
	}
	
	
	
}
