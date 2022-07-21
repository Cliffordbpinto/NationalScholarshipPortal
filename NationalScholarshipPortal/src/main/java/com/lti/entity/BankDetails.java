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
@Table(name = "nsp_bankDetails")
public class BankDetails {

	@Id
	@SequenceGenerator(name="bank_seq",initialValue =100000, allocationSize = 1)
	@GeneratedValue(generator = "bank_seq",strategy = GenerationType.SEQUENCE)
	int bankDetailsId;
	
	int accountNo;
	String holderName;
	String ifscCode;
	
	@OneToOne
	@JoinColumn(name="studentId")
	Student student;

	public int getBankDetailsId() {
		return bankDetailsId;
	}
	public void setBankDetailsId(int bankDetailsId) {
		this.bankDetailsId = bankDetailsId;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
