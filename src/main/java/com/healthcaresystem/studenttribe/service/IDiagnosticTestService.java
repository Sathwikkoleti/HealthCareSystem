package com.healthcaresystem.studenttribe.service;

import java.util.List;

import com.healthcaresystem.studenttribe.entity.DiagnosticTestEntity;
import com.healthcaresystem.studenttribe.exceptions.TestIdNotFoundException;

/*Service Interface for DiagnosticTest
Author : Rala Shashank Yadav
*/
public interface IDiagnosticTestService {
	
	 DiagnosticTestEntity addTests(DiagnosticTestEntity test);
	 
	 DiagnosticTestEntity updateTestData(DiagnosticTestEntity test_data,int id);
	 
	 DiagnosticTestEntity viewTest(int id) throws TestIdNotFoundException;
	
//	 List<DiagnosticTestEntity> viewAllTests();

	List<DiagnosticTestEntity> viewAllTests();

}

