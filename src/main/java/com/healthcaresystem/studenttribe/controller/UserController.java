package com.healthcaresystem.studenttribe.controller;

import com.healthcaresystem.studenttribe.entity.User;
import com.healthcaresystem.studenttribe.exceptions.UserIdNotFound;
import com.healthcaresystem.studenttribe.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/validateUser/{email}/{password}")
    public ResponseEntity<String> validate(@PathVariable String email,@PathVariable String password) {

       return new ResponseEntity<String>(userServiceImpl.validateUser(email,password),HttpStatus.OK);/* new ResponseEntity<User>(User user, HttpStatus.FOUND)*/
    }


    @PostMapping("/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){

        return new ResponseEntity<User>(userService.addUser(user),HttpStatus.CREATED);
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) throws UserIdNotFound {
        return new ResponseEntity<User>(userService.updateUser(id,user),HttpStatus.OK);
    }

    @DeleteMapping("/deleteUser/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable int id) throws UserIdNotFound {
        return new ResponseEntity<User>(userServiceImpl.deleteUser(id),HttpStatus.OK);
    }

    @GetMapping("/viewUser/{id}")
    public ResponseEntity<User> viewUser(@PathVariable int id) throws UserIdNotFound {
        return new ResponseEntity<User>(userServiceImpl.viewUser((id)), HttpStatus.OK);
    }
}
