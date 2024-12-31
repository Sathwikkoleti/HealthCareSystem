package com.healthcaresystem.studenttribe.repository;

/*
Repository Interface
Author : Shiva Prasad
*/

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcaresystem.studenttribe.entity.Admin;
@Repository
public interface IAdminRepository extends JpaRepository<Admin, Integer>{
	Optional<Admin> findByEmail(String email);
	Optional<Admin> deleteByEmail(String email);
}
