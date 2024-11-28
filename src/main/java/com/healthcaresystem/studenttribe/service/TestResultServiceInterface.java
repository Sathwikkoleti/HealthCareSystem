package com.healthcaresystem.studenttribe.service;

import com.healthcaresystem.studenttribe.entity.TestResult;
import com.healthcaresystem.studenttribe.exceptions.TestResultNotFound;

public interface TestResultServiceInterface  {
    TestResult addTestResult(TestResult testResult);
    TestResult updateTestResult(TestResult testResult,int id) throws TestResultNotFound;
    TestResult removeTestResult(int id) throws TestResultNotFound;
    TestResult viewTestResult(int id) throws TestResultNotFound;
}
