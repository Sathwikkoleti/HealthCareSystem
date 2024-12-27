package com.healthcaresystem.studenttribe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcaresystem.studenttribe.entity.DiagnosticTest;
import com.healthcaresystem.studenttribe.exceptions.TestIdNotFoundException;
import com.healthcaresystem.studenttribe.repository.IDiagnosticTestRepository;


/*Service Class for DiagnosticTest
Author : Rala Shashank Yadav
*/

@Service
public class DiagnosticTestServiceImpl implements IDiagnosticTestService
{
	@Autowired
	private IDiagnosticTestRepository itestrepository;

	@Override
	public DiagnosticTest addTests(DiagnosticTest test_data) {
		// TODO Auto-generated method stub
		return itestrepository.save(test_data);
	}
	
	
	@Override
	public DiagnosticTest updateTestData(DiagnosticTest test,int id) throws TestIdNotFoundException
	{
		Optional<DiagnosticTest> optionalTest = itestrepository.findById(test.getTestId());
		if(optionalTest.isEmpty())
			throw new TestIdNotFoundException("For Updating Testdetails not found by TestId: "+id);
		
		return itestrepository.save(test);
//		return itestrepository.findById(test.getTestId()).orElseThrow(() -> new TestIdNotFoundException("Test with Given Id does not exist.So,update can not be done"));
	}

//	@Override 
	public List<DiagnosticTest> viewAllTests(){
		return  itestrepository.findAll();
	}


	@Override
	public DiagnosticTest viewTest(int id) throws TestIdNotFoundException
	{

		Optional<DiagnosticTest> optionalTests =  itestrepository.findById(id); 
		if(optionalTests.isEmpty())
			throw new TestIdNotFoundException("Test Details not found by TestId: "+id);
		return optionalTests.get();
	}
	
}