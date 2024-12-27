package com.healthcaresystem.studenttribe.entity;

<<<<<<< Updated upstream
import jakarta.persistence.*;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
>>>>>>> Stashed changes

@Entity
public class TestResult {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false)
    private String testName;
    @Column(nullable = false)
    private String testResult;
    @Column(nullable = false)
    private String units;
    
    @OneToMany
    @JoinColumn(name="appointment_id")
    private Appointment appointment;
    
    @ManyToOne
    @JoinColumn(name="diagnostic_test_id")
    private DiagnosticTest diagnosticTest;

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