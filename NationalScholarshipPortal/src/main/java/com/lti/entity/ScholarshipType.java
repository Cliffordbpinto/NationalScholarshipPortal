package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class ScholarshipType {

	@Id
	@SequenceGenerator(name = "scholarshipType_seq", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "scholarshipType_seq", strategy = GenerationType.SEQUENCE)
	int scholarshipId;

	String scholarshipName;
	String information;
	String eligibilityCriteria;

	@OneToMany(mappedBy="scholarshipType",cascade = CascadeType.ALL)
	List<ScholarshipApplication> scholarshipApplications;

	public int getScholarshipId() {
		return scholarshipId;
	}
	public void setScholarshipId(int scholarshipId) {
		this.scholarshipId = scholarshipId;
	}
	public String getScholarshipName() {
		return scholarshipName;
	}
	public void setScholarshipName(String scholarshipName) {
		this.scholarshipName = scholarshipName;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}
	public List<ScholarshipApplication> getScholarshipApplications() {
		return scholarshipApplications;
	}
	public void setScholarshipApplications(List<ScholarshipApplication> scholarshipApplications) {
		this.scholarshipApplications = scholarshipApplications;
	}

}
