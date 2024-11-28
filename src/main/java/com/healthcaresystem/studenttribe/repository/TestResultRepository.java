package com.healthcaresystem.studenttribe.repository;
import com.healthcaresystem.studenttribe.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestResultRepository extends JpaRepository<TestResult, Integer> {
//    TestResult addTestResult(TestResult tr);
//    TestResult updateTestResult(TestResult tr,int id);
//    TestResult removeTestResult(TestResult tr);
//    TestResult viewTestResult(TestResult tr);
    Optional<TestResult> findById(Integer id);
}
