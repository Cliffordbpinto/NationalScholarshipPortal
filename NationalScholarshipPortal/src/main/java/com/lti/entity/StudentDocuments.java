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
@Table(name = "nsp_studentDocuments")
public class StudentDocuments {
	
	@Id
	@SequenceGenerator(name = "studentDocuments_seq", allocationSize = 1, initialValue = 801)
	@GeneratedValue(generator = "studentDocuments_seq", strategy = GenerationType.SEQUENCE)
	int StudentDocumentsId;

	String aadharCard;
	String tenthMarksheet;
	String twelfthMarksheet;
	String photo;
	String idCard;
	String casteOrIncomeCertificate;
	String feeReciept;
	String passBook;
	String domecile;
	
	@OneToOne
	@JoinColumn(name="studentId")
	Student student;

	public int getStudentDocumentsId() {
		return StudentDocumentsId;
	}

	public void setStudentDocumentsId(int studentDocumentsId) {
		StudentDocumentsId = studentDocumentsId;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getTenthMarksheet() {
		return tenthMarksheet;
	}

	public void setTenthMarksheet(String tenthMarksheet) {
		this.tenthMarksheet = tenthMarksheet;
	}

	public String getTwelfthMarksheet() {
		return twelfthMarksheet;
	}

	public void setTwelfthMarksheet(String twelfthMarksheet) {
		this.twelfthMarksheet = twelfthMarksheet;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getCasteOrIncomeCertificate() {
		return casteOrIncomeCertificate;
	}

	public void setCasteOrIncomeCertificate(String casteOrIncomeCertificate) {
		this.casteOrIncomeCertificate = casteOrIncomeCertificate;
	}

	public String getFeeReciept() {
		return feeReciept;
	}

	public void setFeeReciept(String feeReciept) {
		this.feeReciept = feeReciept;
	}

	public String getPassBook() {
		return passBook;
	}

	public void setPassBook(String passBook) {
		this.passBook = passBook;
	}

	public String getDomecile() {
		return domecile;
	}

	public void setDomecile(String domecile) {
		this.domecile = domecile;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
