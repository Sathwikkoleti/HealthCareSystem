package com.healthcaresystem.studenttribe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/*
 Entity Class for DiagnosticTest 
 Author : Rala Shahshank Yadav
 */

@Entity
@Table(name="Tests")
public class DiagnosticTest {

	@Id
	@GeneratedValue
	private int testId;
	private String testAvailability;
	private String testName;
	private String sampleType;
	private String sampleUnits;
	private String relevanceOrgan;
	private int testPrice;
	private String patientPreparation;
	
	
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
