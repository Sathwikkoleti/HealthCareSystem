package com.healthcaresystem.studenttribe.service;


import com.healthcaresystem.studenttribe.entity.User;
import com.healthcaresystem.studenttribe.exceptions.UserIdNotFound;

public interface IUserServiceInterface

{
    String validateUser(String email, String password);
    User addUser(User user);
    User updateUser(int id,User user) throws UserIdNotFound;
    User deleteUser(int id) throws UserIdNotFound;
    User viewUser(int id) throws UserIdNotFound;
}
