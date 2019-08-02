package edu.mum.cs.cs425.demo.studentmgmt.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.cs.cs425.demo.studentmgmt.model.Transcript;

public interface TranscriptRepository extends CrudRepository<Transcript, Long>{
	
	

}
