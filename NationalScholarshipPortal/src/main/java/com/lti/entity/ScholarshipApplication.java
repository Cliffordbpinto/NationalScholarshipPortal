package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_schAppl")
public class ScholarshipApplication {
	
	@Id
	@SequenceGenerator(name="app_seq",initialValue =10000, allocationSize = 1)
	@GeneratedValue(generator = "app_seq",strategy = GenerationType.SEQUENCE)
	int applicationId;
	
	String caste;
	String religion;
	LocalDate dateApplied;
	DisabilityStatus dStatus;
	
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
	public DisabilityStatus getdStatus() {
		return dStatus;
	}
	public void setdStatus(DisabilityStatus dStatus) {
		this.dStatus = dStatus;
	}
	
}
