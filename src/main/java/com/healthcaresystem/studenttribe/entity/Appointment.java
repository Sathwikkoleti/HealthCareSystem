package com.healthcaresystem.studenttribe.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Entity
public class Appointment
{
	@Id
    @GeneratedValue
	private int appointmentId;
	
	@Column
	private Date date;
	
	@Column
	private String status;
//	private DiagnosticTest testName;
//	private DiagnosticCenter centerName;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="patient_id")
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
