package com.healthcaresystem.studenttribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.studenttribe.entity.Appointment;
import com.healthcaresystem.studenttribe.exceptions.AppointmentNotFound;
import com.healthcaresystem.studenttribe.service.IAppointmentService;
/*
Controller Class for Appointment Controller
Author : Shiva Prasad
*/
@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	@Autowired
	private IAppointmentService service;

	/****************************
	 * Method: addAppointments Description: It is used to add into the Appointment table in database
	 * 
	 * @returns customers It returns Appointment details of patient
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given
	 *               URI expression.
	 * @RequestBody: It automatically deserializes the JSON or XML data sent in the request body into the specified Java object. 
	 *               
	 * Created By-Shiva Prasad
	 * 
	 ****************************/
	//Adds the new Appointment into Appointment Table =>
	@PostMapping("/addAppointment")
	public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment) {
		return new ResponseEntity<Appointment>(service.addAppointment(appointment), HttpStatus.CREATED);
	}
	
//=================================================================================================================================================	
	
	/****************************
	 * Method: getAppointmentById Description: It is used to get appointment details from Appointment table with appointmentId
	 * 
	 * @returns customers It returns appointment data by appointmentId
	 * @GetMapping: It is used to handle the HTTP GET requests matched with given
	 *               URI expression.
	 * @PathVariable: It extract values from the URI of a request and pass them to a controller method as parameters. 
     *
	 * Created By-Shiva Prasad
	 * 
	 ****************************/
	//Retrives Appointment details using Appointment Id =>
	@GetMapping("/getAppointment/{appointmentId}")
	public ResponseEntity<Appointment> getAppointmentById(@PathVariable("id") int appointmentId)
			throws AppointmentNotFound {
		return new ResponseEntity<Appointment>(service.viewAppointment(appointmentId), HttpStatus.OK);
	}

//=================================================================================================================================================	

	/****************************
	 * Method: getAppointmentById Description: It is used to get appointment details from Appointment table with appointmentId
	 * 
	 * @returns customers It returns appointment data by appointmentId
	 * @PutMapping: It is used to handle the HTTP PUT requests matched with given
	 *               URI expression.
	 * @PathVariable: It extract values from the URI of a request and pass them to a controller method as parameters. 
   	 * @RequestBody: It automatically deserializes the JSON or XML data sent in the request body into the specified Java object. 
     *         
	 * Created By-Shiva Prasad
	 * 
	 ****************************/
	//Updates appointment details and patient details by Appointment Id =>
	@PutMapping("/updateAppointment/{appointmentId}")
	public ResponseEntity<Appointment> updateAppointment(@PathVariable("id") int appointmentId,
			@RequestBody Appointment appointment) throws AppointmentNotFound {
		return new ResponseEntity<Appointment>(service.updateAppointment(appointment, appointmentId), HttpStatus.OK);
	}

//=================================================================================================================================================	

	/****************************
	 * Method: getAppointmentById Description: It is used to get appointment details from Appointment table with appointmentId
	 * 
	 * @returns customers It returns appointment data by appointmentId
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given
	 *               URI expression.
	 * @PathVariable: It extract values from the URI of a request and pass them to a controller method as parameters. 
     *         
	 * Created By-Shiva Prasad
	 * 
	 ****************************/
	//Deletes9(or)Cancel appointment by appointment Id  =>
	@DeleteMapping("/deleteAppointment/{appointmentId}")
	public ResponseEntity<Appointment> deleteAppointment(@PathVariable("appointmentId") int appointmentId)
			throws AppointmentNotFound {
		return new ResponseEntity<Appointment>(service.removeAppointment(appointmentId), HttpStatus.OK);
	}

//=================================================================================================================================================	

	/****************************
	 * Method: getAppointmentById Description: It is used to get appointment details from Appointment table with appointmentId
	 * 
	 * @returns customers It returns appointment data by appointmentId
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given
	 *               URI expression.
	 * @PathVariable: It extract values from the URI of a request and pass them to a controller method as parameters. 
     *         
	 * Created By-Shiva Prasad
	 * 
	 ****************************/
//	@GetMapping("/viewAllAppointments")
//	public ResponseEntity<List<Appointment>> getAllAppointments(@PathVariable int centreId,@PathVariable String test,@PathVariable int status) throws AppointmentNotFound
//	{
//		return new ResponseEntity<List<Appointment>>(service.getAllAppointments(centreId,test,status),HttpStatus.OK);
//	}

//=================================================================================================================================================	

	/****************************
	 * Method: getAppointmentById Description: It is used to get appointment details from Appointment table with appointmentId
	 * 
	 * @returns customers It returns appointment data by appointmentId
	 * @GetMapping: It is used to handle the HTTP GET requests matched with given
	 *               URI expression.
	 * @PathVariable: It extract values from the URI of a request and pass them to a controller method as parameters. 
     *         		  
	 * Created By-Shiva Prasad
	 * 
	 ****************************/
	//Retrives appointments booked by patient by patient name =>
	@GetMapping("/getAllPatientAppointments/{patientName}")
	public ResponseEntity<List<Appointment>> viewAllAppointments(@PathVariable("patientName") String patientName)
			throws AppointmentNotFound {
		return new ResponseEntity<List<Appointment>>(service.viewAllAppointments(patientName), HttpStatus.OK);
	}
}
