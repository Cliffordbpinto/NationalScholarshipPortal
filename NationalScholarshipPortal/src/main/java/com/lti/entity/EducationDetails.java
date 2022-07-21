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
@Table(name = "nsp_educationDetails")
public class EducationDetails {
	@Id
	@SequenceGenerator(name = "edudet_seq", initialValue = 100000, allocationSize = 1)
	@GeneratedValue(generator = "edudet_seq", strategy = GenerationType.SEQUENCE)
	int educationDetailsId;

	String tenthSchool;
	String tenthBoard;
	String tenthScore;
	int tenthYearOfPassing;
	String twelfthCollege;
	String twelfthBoard;
	String twelfthScore;
	int twelfthYearOfPassing;
	EntranceExamType eExam;
	float entranceExamScore;
	
	@OneToOne
	@JoinColumn(name="studentId")
	Student student;

	public int getEducationDetailsId() {
		return educationDetailsId;
	}
	public void setEducationDetailsId(int educationDetailsId) {
		this.educationDetailsId = educationDetailsId;
	}
	public String getTenthSchool() {
		return tenthSchool;
	}
	public void setTenthSchool(String tenthSchool) {
		this.tenthSchool = tenthSchool;
	}
	public String getTenthBoard() {
		return tenthBoard;
	}
	public void setTenthBoard(String tenthBoard) {
		this.tenthBoard = tenthBoard;
	}
	public String getTenthScore() {
		return tenthScore;
	}
	public void setTenthScore(String tenthScore) {
		this.tenthScore = tenthScore;
	}
	public int getTenthYearOfPassing() {
		return tenthYearOfPassing;
	}
	public void setTenthYearOfPassing(int tenthYearOfPassing) {
		this.tenthYearOfPassing = tenthYearOfPassing;
	}
	public String getTwelfthCollege() {
		return twelfthCollege;
	}
	public void setTwelfthCollege(String twelfthCollege) {
		this.twelfthCollege = twelfthCollege;
	}
	public String getTwelfthBoard() {
		return twelfthBoard;
	}
	public void setTwelfthBoard(String twelfthBoard) {
		this.twelfthBoard = twelfthBoard;
	}
	public String getTwelfthScore() {
		return twelfthScore;
	}
	public void setTwelfthScore(String twelfthScore) {
		this.twelfthScore = twelfthScore;
	}
	public int getTwelfthYearOfPassing() {
		return twelfthYearOfPassing;
	}
	public void setTwelfthYearOfPassing(int twelfthYearOfPassing) {
		this.twelfthYearOfPassing = twelfthYearOfPassing;
	}
	public EntranceExamType geteExam() {
		return eExam;
	}
	public void seteExam(EntranceExamType eExam) {
		this.eExam = eExam;
	}
	public float getEntranceExamScore() {
		return entranceExamScore;
	}
	public void setEntranceExamScore(float entranceExamScore) {
		this.entranceExamScore = entranceExamScore;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

}
