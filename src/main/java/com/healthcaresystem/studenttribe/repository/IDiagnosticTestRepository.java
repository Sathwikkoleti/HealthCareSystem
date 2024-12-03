package com.healthcaresystem.studenttribe.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcaresystem.studenttribe.entity.DiagnosticTest;

/*Controller Class for DiagnosticTestController
Created By: Rala Shashank Yadav
*/

@Repository
public interface IDiagnosticTestRepository extends JpaRepository<DiagnosticTest,Integer>{
	Optional<DiagnosticTest> findById(Integer testId);
	}

