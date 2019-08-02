package edu.mum.cs.cs425.demo.studentmgmt.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name="transcripts")
public class Transcript {

	@OneToOne(mappedBy = "transcript")
	//@JoinColumn(name = "")
	private Student student;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long transcriptId;
	private String degreeTitle;

	public Transcript() {
		super();
	}
	public Transcript(String degreeTitle, Student student) {
		super();
		student.setTranscript(this);
		this.degreeTitle = degreeTitle;

	}
	public Long getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Transcript [transcriptId=" + transcriptId + ", degreeTitle=" + degreeTitle + "]";
	}

}
