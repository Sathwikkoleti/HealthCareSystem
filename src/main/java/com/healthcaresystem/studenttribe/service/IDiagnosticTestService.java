package com.healthcaresystem.studenttribe.service;

import java.util.List;

import com.healthcaresystem.studenttribe.entity.DiagnosticTest;
import com.healthcaresystem.studenttribe.exceptions.TestIdNotFoundException;

/*Service Interface for DiagnosticTest
Author : Rala Shashank Yadav
*/
public interface IDiagnosticTestService {
	
	 DiagnosticTest addTests(DiagnosticTest test);
	 
	 DiagnosticTest updateTestData(DiagnosticTest test_data, int id);
	 
	 DiagnosticTest viewTest(int id) throws TestIdNotFoundException;
	
//	 List<DiagnosticTestEntity> viewAllTests();

	List<DiagnosticTest> viewAllTests();

}

