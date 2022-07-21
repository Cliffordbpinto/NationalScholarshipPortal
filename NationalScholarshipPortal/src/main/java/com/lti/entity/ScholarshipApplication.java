package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "nsp_scholarshipApplication")
public class ScholarshipApplication {
	
	@Id
	@SequenceGenerator(name="app_seq",initialValue =10000, allocationSize = 1)
	@GeneratedValue(generator = "app_seq",strategy = GenerationType.SEQUENCE)
	int applicationId;
	
	String caste;
	String religion;
	LocalDate dateApplied;
	DisabilityStatus disabilityStatus;
	
	@ManyToOne
	@JoinColumn(name="scholarshipType")
	ScholarshipType scholarshipType;
	
	@OneToOne(mappedBy="applicationStatus")
	ApplicationStatus applicationStatus;

	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public LocalDate getDateApplied() {
		return dateApplied;
	}
	public void setDateApplied(LocalDate dateApplied) {
		this.dateApplied = dateApplied;
	}
	public DisabilityStatus getDisabilityStatus() {
		return disabilityStatus;
	}
	public void setDisabilityStatus(DisabilityStatus disabilityStatus) {
		this.disabilityStatus = disabilityStatus;
	}
	public ScholarshipType getScholarshipType() {
		return scholarshipType;
	}
	public void setScholarshipType(ScholarshipType scholarshipType) {
		this.scholarshipType = scholarshipType;
	}
	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}
	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}
	
}
