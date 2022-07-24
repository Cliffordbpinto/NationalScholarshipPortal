package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "nsp_studentFamily")
public class StudentFamily {
	@Id
	@SequenceGenerator(name = "studentFamily_seq", allocationSize = 1, initialValue = 801)
	@GeneratedValue(generator = "studentFamily_seq", strategy = GenerationType.SEQUENCE)
	int studentFamilyId;
	
	String fatherName;
	String motherName;
	String fatherOccupation;
	String motherOccupation;
	String fatherAadhaarNo;
	String motherAadhaarNo;

	@OneToOne
	@JoinColumn(name="studentId")
	Student student;

	public int getStudentFamilyId() {
		return studentFamilyId;
	}
	public void setStudentFamilyId(int studentFamilyId) {
		this.studentFamilyId = studentFamilyId;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getFatherAadhaarNo() {
		return fatherAadhaarNo;
	}
	public void setFatherAadhaarNo(String fatherAadhaarNo) {
		this.fatherAadhaarNo = fatherAadhaarNo;
	}
	public String getMotherAadhaarNo() {
		return motherAadhaarNo;
	}
	public void setMotherAadhaarNo(String motherAadhaarNo) {
		this.motherAadhaarNo = motherAadhaarNo;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}	
}
