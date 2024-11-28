package com.healthcaresystem.studenttribe.repository;

import com.healthcaresystem.studenttribe.controller.UserController;
import com.healthcaresystem.studenttribe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(int id);
    Optional<User> findByEmail(String email);
}
