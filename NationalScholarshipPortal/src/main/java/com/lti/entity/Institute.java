package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "nsp_institute")
public class Institute {
	
	@Id
	@SequenceGenerator(name = "inst_seq", initialValue = 10000, allocationSize = 1)
	@GeneratedValue(generator = "inst_seq", strategy = GenerationType.SEQUENCE)
	int instituteId;
	
	String email;
	String password;
	String name;
	InstituteType institutetype;
	String address;
	StateType state;
	String district;
	String pincode;
	int diseCode;
	LocationType location;
	String universityName;
	StateType unversityState;
	String principalName;
	String phoneNo;
	boolean approvalStatus;
	
	@OneToMany(mappedBy="institute", cascade = CascadeType.ALL)
	List<Student> students;

	public int getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InstituteType getInstitutetype() {
		return institutetype;
	}

	public void setInstitutetype(InstituteType institutetype) {
		this.institutetype = institutetype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public StateType getState() {
		return state;
	}

	public void setState(StateType state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public int getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(int diseCode) {
		this.diseCode = diseCode;
	}

	public LocationType getLocation() {
		return location;
	}

	public void setLocation(LocationType location) {
		this.location = location;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public StateType getUnversityState() {
		return unversityState;
	}

	public void setUnversityState(StateType unversityState) {
		this.unversityState = unversityState;
	}

	public String getPrincipalName() {
		return principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean isApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
