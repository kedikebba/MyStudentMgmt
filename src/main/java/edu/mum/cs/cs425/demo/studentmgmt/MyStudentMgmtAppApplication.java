package edu.mum.cs.cs425.demo.studentmgmt;

import java.time.LocalDate;

import edu.mum.cs.cs425.demo.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.demo.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.demo.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.demo.studentmgmt.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.demo.studentmgmt.model.Student;
import edu.mum.cs.cs425.demo.studentmgmt.repository.StudentRepository;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {
	

	private StudentRepository studentRepository;
	private TranscriptRepository transcriptRepository;
	private ClassroomRepository classroomRepository;

	@Autowired
	public MyStudentMgmtAppApplication(StudentRepository studentRepository, TranscriptRepository transcriptRepository, ClassroomRepository classroomRepository){
		this.studentRepository = studentRepository;
		this.transcriptRepository = transcriptRepository;
		this.classroomRepository = classroomRepository;
	}

	
	public static void main(String[] args) {
		SpringApplication.run(MyStudentMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Classroom c1 = new Classroom("McLaughhlin Building", "M105");
		Classroom c2 = new Classroom("Verill Building", "M106");
		Classroom c3 = new Classroom("Argiro Building", "M107");
		/*
		Classroom c4 = new Classroom("Library Building", "M108");
		Classroom c5 = new Classroom("Arts Building", "M109");
		Classroom c6 = new Classroom("Festival Building", "M110");
		Classroom c7 = new Classroom("Admin Building", "M111");

		Student s = new Student("000-61-0001", "Wagobera", "Edgar", "Kedi",
				4.99, LocalDate.of(2019, 04, 27), c1);

		Student s1 = new Student("000-61-0002", "Samuel", "", "Luswata",
				4.98, LocalDate.of(2019, 02, 22),c1);

		Student s2 = new Student("000-61-0003", "Moses", "Niyo", "Niyonshuti",
				5.00, LocalDate.of(2019, 04, 26),c2);

		Student s3 = new Student("000-61-0004", "Timothy", "Lubuto", "Nuwarinda",
				4.97, LocalDate.of(2019, 04, 29),c2);

		Student s4 = new Student("000-61-0005", "James", "", "Alitukhiya",
				4.90, LocalDate.of(2019, 01, 01),c3);

		Student s5 = new Student("000-61-0006", "Brian", "", "Bwengye",
				4.96, LocalDate.of(2019, 03, 03),c3);
*/
		Student s = new Student("000-61-0001", "Wagobera", "Edgar", "Kedi",
				4.99, LocalDate.of(2019, 04, 27));

		Student s1 = new Student("000-61-0002", "Samuel", "", "Luswata",
				4.98, LocalDate.of(2019, 02, 22));

		Student s2 = new Student("000-61-0003", "Moses", "Niyo", "Niyonshuti",
				5.00, LocalDate.of(2019, 04, 26));

		Student s3 = new Student("000-61-0004", "Timothy", "Lubuto", "Nuwarinda",
				4.97, LocalDate.of(2019, 04, 29));

		Student s4 = new Student("000-61-0005", "James", "", "Alitukhiya",
				4.90, LocalDate.of(2019, 01, 01));

		Student s5 = new Student("000-61-0006", "Brian", "", "Bwengye",
				4.96, LocalDate.of(2019, 03, 03));

		Transcript t1 = new Transcript("BSC Computer Science", s);
		Transcript t2 = new Transcript("MSC Computer Science",s1);
		Transcript t3 = new Transcript("BSC Vedic Science", s3);
		Transcript t4 = new Transcript("MSC Vedic Science", s4);
		Transcript t5 = new Transcript("BSC Science and Sports", s5);
		Transcript t6 = new Transcript("MSC Science and Sports", s2);

		c1.setStudentList(s);
		c1.setStudentList(s1);
		c1.setStudentList(s2);


		saveClassroom(c1);
		saveClassroom(c2);
		saveClassroom(c3);

		/*
		saveClassroom(c4);
		saveClassroom(c5);
		saveClassroom(c6);
		saveClassroom(c7);
*/

		Student savedStudent5 = saveStudent(s5);
		Student savedStudent3 = saveStudent(s3);
		Student savedStudent4 = saveStudent(s4);
		Student savedStudent2 = saveStudent(s2);
		Student savedStudent1 = saveStudent(s1);
		Student savedStudent = saveStudent(s);
	}
	
	public Student saveStudent(Student s) {
		return this.studentRepository.save(s);
	}

	public Transcript saveTranscript(Transcript t) {
		return this.transcriptRepository.save(t);
	}
	public Classroom saveClassroom(Classroom classroom) {
		return this.classroomRepository.save(classroom);
	}

}
