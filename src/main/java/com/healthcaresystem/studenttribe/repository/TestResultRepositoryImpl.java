//package com.healthcaresystem.studenttribe.repository;
//
//
//import com.healthcaresystem.studenttribe.entity.TestResult;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Repository;
//
//@Repository
//@Transactional
//public class TestResultRepositoryImpl implements TestResultRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    @Override
//    public TestResult addTestResult(TestResult testResult) {
//        em.persist(testResult);
//        return testResult;
//    }
//
//    @Override
//    public TestResult updateTestResult(TestResult testResult,int id) {
//        em.merge(testResult);
//        return testResult;
//    }
//
//    @Override
//    public TestResult removeTestResult(TestResult testResult) {
//        em.remove(testResult);
//        return testResult;
//    }
//
//    @Override
//    public TestResult viewTestResult(TestResult testResult) {
//        em.find(TestResult.class, testResult.getId());
//        return testResult;
//    }
//}
