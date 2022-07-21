package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ScholarshipType {

	@Id
	@SequenceGenerator(name = "scholarshipType_seq", initialValue = 1001, allocationSize = 1)
	@GeneratedValue(generator = "scholarshipType_seq", strategy = GenerationType.SEQUENCE)
	int scholarshipId;

	String scholarshipName;
	String EligibilityCriteria;

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

	public String getEligibilityCriteria() {
		return EligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		EligibilityCriteria = eligibilityCriteria;
	}

}
