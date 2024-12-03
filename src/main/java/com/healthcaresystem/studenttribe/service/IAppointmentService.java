package com.healthcaresystem.studenttribe.service;

import java.util.List;

import com.healthcaresystem.studenttribe.entity.Appointment;
import com.healthcaresystem.studenttribe.exceptions.AppointmentNotFound;
public interface IAppointmentService
{
	Appointment addAppointment(Appointment appointment);
	Appointment viewAppointment(int appointmentId) throws AppointmentNotFound;
	Appointment updateAppointment(Appointment appoinmtment,int appointmentId) throws AppointmentNotFound;
	Appointment removeAppointment(int appointmentId) throws AppointmentNotFound;
//	List<Appointment> getAllAppointments(int centreId,String test,int status) throws AppointmentNotFound;
	List<Appointment> viewAllAppointments(String patientName) throws AppointmentNotFound;


}
