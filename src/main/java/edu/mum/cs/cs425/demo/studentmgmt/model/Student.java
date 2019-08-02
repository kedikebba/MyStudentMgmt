package edu.mum.cs.cs425.demo.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

@Entity
@Table(name="students")

public class Student {

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "transcriptId_FK", referencedColumnName = "transcriptId")
	private Transcript transcript;

	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "classroomId_FK", referencedColumnName = "classroomId")
	private Classroom classroom;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	@Column(nullable = false)
	private String studentNumber;
	
	@Column(nullable = false)
	private String firstName;
	
	private String middleName;
	
	@Column(nullable = false)
	private String lastName;
	
	private double cgpa;
	
	private LocalDate dateOfEnrollment;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Student(String studentNumber, String firstName, String middleName, String lastName,
			double cgpa, LocalDate dateOfEnrollment) {//, Classroom classroom
		super();

		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
		this.transcript = new Transcript();
		this.classroom = classroom;
		//classroom.setStudentList(this);
	}


	public void setTranscript(Transcript transcript){
		this.transcript = transcript;
	}
	public Transcript getTranscript(){
		return transcript;
	}

	public void setClassroom(Classroom classroom){
		this.classroom = classroom;
	}
	public Classroom getClassroom(){
		return classroom;
	}


	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}

	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentNumber=" + studentNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", cgpa=" + cgpa + ", dateOfEnrollment="
				+ dateOfEnrollment + "]";
	}
	
	
	
	
	
	

}
