package com.lti.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

//@Entity(name = "nsp_user")
public class User {
//	@Id
//	@SequenceGenerator(name = "user_seq", allocationSize = 1, initialValue = 1)
//	@GeneratedValue(generator = "user_seq", strategy = GenerationType.SEQUENCE)
//	int userId;
//	
//	String email;
//	String password;
//	UserType userType;
//
//	// confused about (StateNodalOfficr-User) relationship need to discuss
//	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//	List<Student> students;
//	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//	List<Student> institutes;
//	
//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
//	List<Student> StateNodalOfficers;
//
//	public int getUserId() {
//		return userId;
//	}
//	public void setUserId(int userId) {
//		this.userId = userId;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public UserType getUserType() {
//		return userType;
//	}
//	public void setUserType(UserType userType) {
//		this.userType = userType;
//	}
//	public List<Student> getStudents() {
//		return students;
//	}
//	public void setStudents(List<Student> students) {
//		this.students = students;
//	}
//	public List<Student> getInstitutes() {
//		return institutes;
//	}
//	public void setInstitutes(List<Student> institutes) {
//		this.institutes = institutes;
//	}
//	public List<Student> getStateNodalOfficers() {
//		return StateNodalOfficers;
//	}
//	public void setStateNodalOfficers(List<Student> stateNodalOfficers) {
//		StateNodalOfficers = stateNodalOfficers;
//	}
}
