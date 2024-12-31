package com.healthcaresystem.studenttribe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthcaresystem.studenttribe.entity.Admin;
import com.healthcaresystem.studenttribe.exceptions.AdminNotFound;
import com.healthcaresystem.studenttribe.service.IAdminService;

import jakarta.servlet.http.HttpSession;


@RestController
@RequestMapping
public class AdminController
{
	@Autowired
	HttpSession session;
	
	@Autowired
	private IAdminService service;
	
	/****************************
	* Method: addAdmin
	 * Description: It allows to add the User.
	 * @RequestMapping: It is used to map HTTP requests to handler methods of MVC and REST controllers.
	 * @RestController: It is used to create RESTful web services using MVC.
	 * @PostMapping: It is used to handle the HTTP POST requests matched with given URL expression.
	 * @Autowired: It enables to inject object dependency implicitly.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
     */
	
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin)
	{
		return new ResponseEntity(service.addAdmin(admin),HttpStatus.OK);
	}
	
//*********************************************************************************************************************	
	
	/****************************
	 * Method: removeAdmin
	 * Description: It allows to remove the user.
	 * @RequestBody: It is used to bind HTTP request body with a domain object in method parameter or return type
	 * @DeleteMapping: It is used to handle the HTTP DELETE requests matched with given URL expression.
     */ 
	
	@DeleteMapping("/removeAdmin")
	public ResponseEntity<Admin> removeAdmin(@RequestBody String email)  throws AdminNotFound{
		if(email==null)
			return new ResponseEntity("Invalid",HttpStatus.NOT_FOUND);
		Admin userImpl=service.removeAdmin(email);
		return new ResponseEntity(userImpl,HttpStatus.OK);
		
	}

//*********************************************************************************************************************	
	
	/****************************
	 * Method: getUserById
	 * Description: It allows to view the user by id.
	 * @PathVariable: It is used to handle template variables in the request URL
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
     */
		
	@GetMapping("/viewAllAdmins")
	public ResponseEntity<List<Admin>> viewAllAdmins() throws AdminNotFound{
		//logger.trace("fetching all the plants");
		return new ResponseEntity<List<Admin>>(service.getAllAdmins(), HttpStatus.OK);
	}
//*********************************************************************************************************************	
	
	/**************************** 
	 * Method: signout
	 * Description: It allows to singout the user.
	 * @GetMapping:It is used to handle the HTTP GET requests matched with given URL Expression.
     */
	
	@GetMapping("/signOut")
	public ResponseEntity<Admin> signOut(){
		session.invalidate();
		return new ResponseEntity("LoggedOut",HttpStatus.OK);
	}
}