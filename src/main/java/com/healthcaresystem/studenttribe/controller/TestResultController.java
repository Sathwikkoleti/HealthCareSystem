package com.healthcaresystem.studenttribe.controller;

import com.healthcaresystem.studenttribe.entity.TestResult;
import com.healthcaresystem.studenttribe.exceptions.TestResultNotFound;
import com.healthcaresystem.studenttribe.service.TestResultServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/TestResult")
public class TestResultController {
    @Autowired
    private TestResultServiceImpl testResultService;

    @PostMapping("/addTestResult")
    public ResponseEntity<TestResult> addTestResult(@RequestBody
    TestResult testResult){
        return new ResponseEntity<TestResult>(testResultService.addTestResult(testResult), HttpStatus.OK);
    }

    @GetMapping("/viewTestResult/{id}")
    public ResponseEntity<TestResult> viewTestResult(@PathVariable int id) throws TestResultNotFound {
        return new ResponseEntity<TestResult>(testResultService.viewTestResult(id), HttpStatus.OK);
    }
    @PutMapping("/updateTestResult/{id}")
    public ResponseEntity<TestResult> updateTestResult(@RequestBody TestResult testResult,@PathVariable int id) throws TestResultNotFound{
        return new ResponseEntity<TestResult>(testResultService.updateTestResult(testResult,id), HttpStatus.OK);
    }
    @DeleteMapping("/deleteTestResult/{id}")
    public ResponseEntity<TestResult> deleteTestResult(@PathVariable int id) throws TestResultNotFound  {
        return new ResponseEntity<TestResult>(testResultService.removeTestResult(id), HttpStatus.OK);
    }
}
