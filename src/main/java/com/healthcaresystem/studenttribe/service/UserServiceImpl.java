package com.healthcaresystem.studenttribe.service;

import com.healthcaresystem.studenttribe.entity.User;
import com.healthcaresystem.studenttribe.exceptions.UserIdNotFound;
import com.healthcaresystem.studenttribe.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Service
@RequestMapping("/User")
public class UserServiceImpl implements IUserServiceInterface {

    @Autowired
    private IUserRepository userRepository;


    @Override
    public String validateUser(String email, String password) {
        Optional<User> userData = userRepository.findByEmail(email);
        String checkEmail;
        String checkPassword;
        String end = "";

        if (userData.isPresent()) {
            checkEmail = userData.get().getEmail();
            checkPassword = userData.get().getPassword();
            if (checkEmail.equals(email) && checkPassword.equals(password)) {
                end = "Valid user";
            }
        } else {
            end = "Invalid user";
        }


        return end;
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(int id,User user) throws UserIdNotFound {
        Optional<User> userData = userRepository.findById(id);
        if(userData.isEmpty()) {
            throw new UserIdNotFound("User Not Found");
        }
        return userRepository.save(user);
    }

    @Override
    public User deleteUser(int id) throws UserIdNotFound {
        Optional<User> userData = userRepository.findById(id);
        if(userData.isEmpty()) {
            throw new UserIdNotFound("User Not Found");
        }
        userRepository.deleteById(id);
        return userData.get();
    }

    @Override
    public User viewUser(int id) throws UserIdNotFound {
        Optional<User> UserData = userRepository.findById(id);
        if(UserData.isEmpty()) {
            throw new UserIdNotFound("User Not Found");
        }
        return UserData.get();
    }
}

