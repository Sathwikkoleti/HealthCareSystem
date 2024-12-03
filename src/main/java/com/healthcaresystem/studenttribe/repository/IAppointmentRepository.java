package com.healthcaresystem.studenttribe.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcaresystem.studenttribe.entity.Appointment;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment,Integer>
{
	Optional<Appointment> findById(Integer appointmentId);
//	List<Appointment> findByCentreIdAndTestAndStatus(int centreId,String test,int status);
    List<Appointment> findByPatientPatientName(String patientName);

}
