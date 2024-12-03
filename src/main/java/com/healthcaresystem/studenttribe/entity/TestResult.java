package com.healthcaresystem.studenttribe.entity;

import jakarta.persistence.*;

@Entity
public class TestResult {
    @Id
    @GeneratedValue
    private int id;
    private String testName;
    private String testResult;
    private String units;

    @ManyToOne
    @JoinColumn(name="appointment_id", nullable = false)
    private Appointment appointment;
    @ManyToOne
    @JoinColumn(name = "dignostic_test_id", nullable = false)
    private DiagnosticTest dignostictest;

    public TestResult() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }
}
