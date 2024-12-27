package com.healthcaresystem.studenttribe.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Appointment
{
	@Id
    @GeneratedValue
	private int appointmentId;
	
	@Column(nullable = false)
	private Date date;
	
	@Column(nullable = false)
	private String status;
	
    @ManyToMany
    @JoinTable(
      name = "appointment_diagnostic_test",  // Join table name
      joinColumns = @JoinColumn(name = "appointment_id"),  // Foreign key column in the join table
      inverseJoinColumns = @JoinColumn(name = "diagnostic_test_id") // Foreign key column in the join table
    )
    private List<DiagnosticTest> diagnosticTests;  // List of tests associated with the appointmen
	
	@ManyToOne
	@JoinColumn(name = "diagnosticCenterId")
	private DiagnosticCenter diagnosticCenter;
	
	@OneToMany(mappedBy = "appointment" , cascade = CascadeType.ALL)
	private Set<TestResult> testResults;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id",referencedColumnName = "patientId")
	private Patient patient;
	
	public Appointment() {}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
}