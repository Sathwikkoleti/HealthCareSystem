package com.healthcaresystem.studenttribe.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 Entity Class for DiagnosticTest 
 Author : Rala Shahshank Yadav
 */

@Entity
@Table(name="Tests")
public class DiagnosticTest{

	@Id
	@GeneratedValue
	private int testId;
	@Column(nullable = false)
	private String testAvailability;
	@Column(nullable = false)
	private String testName;
	@Column(nullable = false)
	private String sampleType;
	@Column(nullable = false)
	private String sampleUnits;
	@Column(nullable = false)
	private String relevanceOrgan;
	@Column(nullable = false)
	private int testPrice;
	@Column(nullable = false)
	private String patientPreparation;
	
	@ManyToOne
	@JoinColumn(name="diagnotic_center_id")
	private DiagnosticCenter diagnosticCenter;  
	
	@OneToMany(mappedBy = "diagnosticTest", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<TestResult> testResults;
	
    @ManyToMany(mappedBy = "diagnosticTests")  // Mapping back to Appointment
    private List<Appointment> appointments;  // List of appointments for this test
	
	public int getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(int testPrice) {
		this.testPrice = testPrice;
	}
	public DiagnosticTest()
	{
		
	}
	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestAvailability() {
		return testAvailability;
	}
	public void setTestAvailability(String testAvailability) {
		this.testAvailability = testAvailability;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getSampleType() {
		return sampleType;
	}
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	public String getSampleUnits() {
		return sampleUnits;
	}
	public void setSampleUnits(String sampleUnits) {
		this.sampleUnits = sampleUnits;
	}
	public String getRelevanceOrgan() {
		return relevanceOrgan;
	}
	public void setRelevanceOrgan(String relevanceOrgan) {
		this.relevanceOrgan = relevanceOrgan;
	}
	public String getPatientPreparation() {
		return patientPreparation;
	}
	public void setPatientPreparation(String patientPreparation) {
		this.patientPreparation = patientPreparation;
	}
}