package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ApplicationStatus {
	
	@Id
	@SequenceGenerator(name="appStatus_seq", initialValue=1001, allocationSize=1)
	@GeneratedValue(generator="appStatus_seq", strategy = GenerationType.SEQUENCE)
	int scholarshipApplicationId;
	
	boolean approvedByInstitute;
	LocalDate institute_timestamp;
	boolean approvedBySO;
	LocalDate so_timestamp;
	boolean approvedByMinistry;
	LocalDate ministry_timestamp;
	
	public int getScholarshipApplicationId() {
		return scholarshipApplicationId;
	}
	public void setScholarshipApplicationId(int scholarshipApplicationId) {
		this.scholarshipApplicationId = scholarshipApplicationId;
	}
	public boolean isApprovedByInstitute() {
		return approvedByInstitute;
	}
	public void setApprovedByInstitute(boolean approvedByInstitute) {
		this.approvedByInstitute = approvedByInstitute;
	}
	public LocalDate getInstitute_timestamp() {
		return institute_timestamp;
	}
	public void setInstitute_timestamp(LocalDate institute_timestamp) {
		this.institute_timestamp = institute_timestamp;
	}
	public boolean isApprovedBySO() {
		return approvedBySO;
	}
	public void setApprovedBySO(boolean approvedBySO) {
		this.approvedBySO = approvedBySO;
	}
	public LocalDate getSo_timestamp() {
		return so_timestamp;
	}
	public void setSo_timestamp(LocalDate so_timestamp) {
		this.so_timestamp = so_timestamp;
	}
	public boolean isApprovedByMinistry() {
		return approvedByMinistry;
	}
	public void setApprovedByMinistry(boolean approvedByMinistry) {
		this.approvedByMinistry = approvedByMinistry;
	}
	public LocalDate getMinistry_timestamp() {
		return ministry_timestamp;
	}
	public void setMinistry_timestamp(LocalDate ministry_timestamp) {
		this.ministry_timestamp = ministry_timestamp;
	}
	
	
}
