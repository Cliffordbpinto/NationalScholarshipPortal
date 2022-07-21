package lti.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "table_studentFamily")
public class StudentFamily {
	@Id
	@SequenceGenerator(name = "studentFamily_seq", allocationSize = 1, initialValue = 801)
	@GeneratedValue(generator = "studentFamily_seq", strategy = GenerationType.SEQUENCE)
	int familyId;
	String fatherName;
	String motherName;
	String fatherOccupation;
	String motherOccupation;
	String fatherAadhaarNo;
	String motherAadhaarNo;

	@OneToOne
	@JoinColumn(name="student_id")
	Student student;

	public int getFamilyId() {
		return familyId;
	}

	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getFatherOccupation() {
		return fatherOccupation;
	}

	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}

	public String getMotherOccupation() {
		return motherOccupation;
	}

	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}

	public String getFatherAadhaarNo() {
		return fatherAadhaarNo;
	}

	public void setFatherAadhaarNo(String fatherAadhaarNo) {
		this.fatherAadhaarNo = fatherAadhaarNo;
	}

	public String getMotherAadhaarNo() {
		return motherAadhaarNo;
	}

	public void setMotherAadhaarNo(String motherAadhaarNo) {
		this.motherAadhaarNo = motherAadhaarNo;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
