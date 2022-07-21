package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "nsp_stateNodalOfficer")
public class StateNodalOfficer {
	@Id
	@SequenceGenerator(name = "sno_seq", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "sno_seq", strategy = GenerationType.SEQUENCE)
	int stateNodalOfficerId;
	
	String name;
	StateType type;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;

	public int getStateNodalOfficerId() {
		return stateNodalOfficerId;
	}
	public void setStateNodalOfficerId(int stateNodalOfficerId) {
		this.stateNodalOfficerId = stateNodalOfficerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StateType getType() {
		return type;
	}
	public void setType(StateType type) {
		this.type = type;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
