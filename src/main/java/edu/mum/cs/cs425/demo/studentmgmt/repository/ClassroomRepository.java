package edu.mum.cs.cs425.demo.studentmgmt.repository;

import edu.mum.cs.cs425.demo.studentmgmt.model.Classroom;
import org.springframework.data.repository.CrudRepository;

public interface ClassroomRepository extends CrudRepository<Classroom, Long> {
}
