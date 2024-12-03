package com.healthcaresystem.studenttribe.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcaresystem.studenttribe.entity.TestResult;
import com.healthcaresystem.studenttribe.exceptions.TestResultNotFound;
import com.healthcaresystem.studenttribe.repository.ITestResultRepository;

@Service
public class ITestResultServiceImpl implements TestResultServiceInterface {

    //    @Autowired
//    private TestResultRepositoryImpl testResultRepository;
    @Autowired
    private ITestResultRepository testResultRepository;

    @Override
    public TestResult addTestResult(TestResult testResult) {

        return testResultRepository.save(testResult);
    }

    @Override
    public TestResult updateTestResult(TestResult testResult, int id) throws TestResultNotFound {
        testResult.setId(id);
        Optional<TestResult> optionalTestResult = testResultRepository.findById(id);
        if(optionalTestResult.isEmpty()) {
            throw new TestResultNotFound("Test Result Not Found with id : " + id);
        }
        return testResultRepository.save(testResult);
    }

    @Override
    public TestResult removeTestResult(int id) throws TestResultNotFound{
        Optional<TestResult> testResultDelete = testResultRepository.findById(id);
        if(testResultDelete.isEmpty())
            throw new TestResultNotFound("Test Result Not Found with id : "+id );
        testResultRepository.deleteById(id);
        return testResultDelete.get();
    }

    @Override
    public TestResult viewTestResult(int id) throws TestResultNotFound{
        Optional<TestResult> testResultView = testResultRepository.findById(id);
        if(testResultView.isEmpty())
            throw new TestResultNotFound("Test Result Not Found with id : "+id );
        return testResultRepository.getById(id);
    }

}
