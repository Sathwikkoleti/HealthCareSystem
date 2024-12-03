package com.healthcaresystem.studenttribe.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcaresystem.studenttribe.entity.TestResult;

public interface ITestResultRepository extends JpaRepository<TestResult, Integer> {
//    TestResult addTestResult(TestResult tr);
//    TestResult updateTestResult(TestResult tr,int id);
//    TestResult removeTestResult(TestResult tr);
//    TestResult viewTestResult(TestResult tr);
    Optional<TestResult> findById(Integer id);
}
