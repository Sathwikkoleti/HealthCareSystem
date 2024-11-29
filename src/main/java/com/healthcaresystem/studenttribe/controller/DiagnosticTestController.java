package com.healthcaresystem.studenttribe.controller;

import java.util.List;

//import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.studenttribe.entity.DiagnosticTestEntity;
import com.healthcaresystem.studenttribe.service.IDiagnosticTestService;

import jakarta.servlet.http.HttpSession;
/*Controller Class for DiagnosticTest
  Author :Rala Shashank Yadav
 */

@RestController
@RequestMapping("/testController")

public class DiagnosticTestController {

	@Autowired
	private IDiagnosticTestService addTestService;

	/****************************
	* Method: addTest
	 * Description: It allows to add the Tests.
	 * @RequestMapping: It is used to map HTTP requests to handler methods of MVC and REST controllers.
	 * @RestController: It is used to create RESTful web services using MVC.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     *
     **************************/
	
	
	@PostMapping("/addTest")
	public ResponseEntity<DiagnosticTestEntity> addTests(@RequestBody DiagnosticTestEntity test_data){
		return new ResponseEntity(addTestService.addTests(test_data),HttpStatus.OK);
	}
	
	/****************************
	 * Method: updateTestDetails 
	 * Description: It is used to update test in tests table
	 * @returns test _data It returns String type message 
	 * @PutMapping: It is used to handle the HTTP PUT requests matched with given URI expression.
	 * @RequestBody: It used to bind the HTTP request/response body with a domain object in method parameter or return type.
	 * 
	 ****************************/
	
	@PutMapping({"/updateTestDetails/{id}"})
	public ResponseEntity<DiagnosticTestEntity> updateTest(@RequestBody DiagnosticTestEntity test_data,@PathVariable int id){
		addTestService.updateTestData(test_data,id);
		return new ResponseEntity(test_data,HttpStatus.OK);
	}
	
	/****************************
	 * Method: viewAllTestsDetails
	 * Description: It is used to view all tests details in tests table
	 * @returns test_data It returns all tests with all its details
	 * @GetMapping: It is used to handle the HTTP POST requests matched with given URI expression.
	 * @RequestBody: It used to bind the HTTP request/response body with a domain object in method parameter or return type.
	 ****************************/
	
	@GetMapping("/viewAllTestsDetails")
	public ResponseEntity<List<DiagnosticTestEntity>> viewAllTests(){
		return new ResponseEntity<List<DiagnosticTestEntity>>(addTestService.viewAllTests(),HttpStatus.OK);
	}
	
	/****************************
	 * Method: ViewTest by Id
	 * Description: It is used to view test details in tests table with a specific test Id
	 * @returns DiagnosticTestEntity It returns test with its details
	 * @GetMapping: It is used to handle the HTTP POST requests matched with given URI expression.
	 * @RequestBody: It used to bind the HTTP request/response body with a domain object in method parameter or return type.
	 ****************************/
	
	@GetMapping("/viewTest/{id}")
	public ResponseEntity<DiagnosticTestEntity> viewTest(@PathVariable Integer id){
		return new ResponseEntity<DiagnosticTestEntity>(addTestService.viewTest(id), HttpStatus.OK);
	}
	
	
}
