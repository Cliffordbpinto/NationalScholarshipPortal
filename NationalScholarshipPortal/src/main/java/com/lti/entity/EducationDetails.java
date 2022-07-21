package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_EducationDetails")
public class EducationDetails {
	@Id
	@SequenceGenerator(name = "edudet_seq", initialValue = 100000, allocationSize = 1)
	@GeneratedValue(generator = "edudet_seq", strategy = GenerationType.SEQUENCE)
	int educationDetailsId;

	String tenthBoard;

	String tenthScore;

	int tenthYearOfPassing;
	String twelfthBoard;

	String twelfthScore;

	int twelfthYearOfPassing;

	EntranceExamType eExam;

	int entranceExamScore;
//	  studentId fk

	public int getEducationDetailsId() {
		return educationDetailsId;
	}

	public void setEducationDetailsId(int educationDetailsId) {
		this.educationDetailsId = educationDetailsId;
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

	public int getEntranceExamScore() {
		return entranceExamScore;
	}

	public void setEntranceExamScore(int entranceExamScore) {
		this.entranceExamScore = entranceExamScore;
	}

}
