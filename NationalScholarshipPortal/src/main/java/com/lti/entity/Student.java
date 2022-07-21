package com.lti.entity;
import java.time.LocalDate;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="student_tbl")
public class Student {
	
	
		@Id
		@SequenceGenerator(name="stud_seq",initialValue =10000, allocationSize = 1)
		@GeneratedValue(generator = "stud_seq",strategy = GenerationType.SEQUENCE)
		

		private int AadharNumber;
		
		private int studentId;
		
		private String StateofDomicile;
		
		private int userId;
		
		private String dist;
		
		private String Name;
		
		private LocalDate dob;
		
		private String Gender;
		
		private int MobileNumber;
		
		private String Email;
//		private int BankDetailsId;fk
		
//		private int DocumentsId;fk
		
//		private int InstituteId;fk

		public int getAadharNumber() {
			return AadharNumber;
		}

		public void setAadharNumber(int aadharNumber) {
			AadharNumber = aadharNumber;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStateofDomicile() {
			return StateofDomicile;
		}

		public void setStateofDomicile(String stateofDomicile) {
			StateofDomicile = stateofDomicile;
		}

		public int getUserId() {
			return userId;
		}

		public void setUserId(int userId) {
			this.userId = userId;
		}

		public String getDist() {
			return dist;
		}

		public void setDist(String dist) {
			this.dist = dist;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public LocalDate getDob() {
			return dob;
		}

		public void setDob(LocalDate dob) {
			this.dob = dob;
		}

		public String getGender() {
			return Gender;
		}

		public void setGender(String gender) {
			Gender = gender;
		}

		public int getMobileNumber() {
			return MobileNumber;
		}

		public void setMobileNumber(int mobileNumber) {
			MobileNumber = mobileNumber;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}
		

		
	}	

