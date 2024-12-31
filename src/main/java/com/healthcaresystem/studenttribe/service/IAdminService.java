package com.healthcaresystem.studenttribe.service;

import java.util.List;

import com.healthcaresystem.studenttribe.entity.Admin;
import com.healthcaresystem.studenttribe.exceptions.AdminNotFound;

/*
Admin Service Interface
Author : Shiva Prasad
*/

public interface IAdminService
{
	public Admin addAdmin(Admin admin);
	public Admin removeAdmin(String email) throws AdminNotFound;
	public Admin validateAdmin(String adminId,String password)  throws AdminNotFound;
	public List<Admin> getAllAdmins() throws AdminNotFound;
}
