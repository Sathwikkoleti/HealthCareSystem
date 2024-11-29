package com.healthcaresystem.studenttribe.service;
import com.healthcaresystem.studenttribe.entity.Patient;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcaresystem.studenttribe.entity.Appointment;
import com.healthcaresystem.studenttribe.exceptions.AppointmentNotFound;
import com.healthcaresystem.studenttribe.repository.IAppointmentRepository;
@Service
public class AppointmentServiceImpl implements IAppointmentService
{
	@Autowired
	private IAppointmentRepository repository;
	
	@Override
	public Appointment addAppointment(Appointment appointment) 
	{
		return repository.save(appointment);
	}


	@Override
	public Appointment updateAppointment(Appointment appointment,int appointmentId) throws AppointmentNotFound
	{
		Optional<Appointment> findById=repository.findById(appointmentId);
		if(findById.isEmpty())
			throw new AppointmentNotFound("Appointment not found by appointmentId: "+appointmentId);
		
		appointment.setAppointmentId(appointmentId);
		return repository.save(appointment);
	}

	@Override
	public Appointment removeAppointment(int appointmentId) throws AppointmentNotFound
	{
		Optional<Appointment> findById=repository.findById(appointmentId);
		if(findById.isEmpty())
			throw new AppointmentNotFound("Appointment not found by appointmentId: "+appointmentId);
		
		repository.deleteById(appointmentId);
		return findById.get();
	}
	
	@Override
	public Appointment viewAppointment(int appointmentId) throws AppointmentNotFound
	{
		Optional<Appointment> findById=repository.findById(appointmentId);
		if(findById.isEmpty())
			throw new AppointmentNotFound("Appointment not found by appointmentId: "+appointmentId);
		
		return findById.get();
	}
	
//	@Override
//	public List<Appointment> getAllAppointments(int centreId, String test, int status) throws AppointmentNotFound
//	{
//		List<Appointment> appointments=repository.findByCentreIdAndTestAndStatus(centreId, test, status);
//		if(appointments.isEmpty())
//			throw new AppointmentNotFound("There are no appointments");
//		
//		return getAllAppointments(centreId,test,status);
//	}
	
	@Override
	public List<Appointment> viewAllAppointments(String patientName) throws AppointmentNotFound
	{
		List<Appointment> appointments=repository.findByPatientPatientName(patientName);
		if(appointments.isEmpty())
			throw new AppointmentNotFound("Patient not found by patientName: "+patientName);
		

		return appointments;
	}
}
