package com.healthcaresystem.studenttribe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.healthcaresystem.studenttribe.entity.Admin;
import com.healthcaresystem.studenttribe.exceptions.AdminNotFound;
import com.healthcaresystem.studenttribe.repository.IAdminRepository;


/*
Admin service implemtation
Author : Shiva Prasad
*/

@Service
@Transactional
public class AdminServiceImpl implements IAdminService 
{
	@Autowired
	private IAdminRepository iadminrepository;

	@Override
	public Admin validateAdmin(String email,String password) throws AdminNotFound
	{
		Optional<Admin> existsAdmin = iadminrepository.findByEmail(email);
		if (existsAdmin.isEmpty())
			throw new AdminNotFound("Admin Not Exists");
		
		return existsAdmin.get();
	}
	
	@Override
	public Admin addAdmin(Admin admin) 
	{
		return iadminrepository.save(admin);
	}
	
	@Override
	public Admin removeAdmin(String email) throws AdminNotFound {
		Optional<Admin> existsAdmin = iadminrepository.findByEmail(email);
		if (existsAdmin.isEmpty())
			throw new AdminNotFound("Admin Not Exists");
		
		iadminrepository.deleteByEmail(email);
		return existsAdmin.get();
	}
	
	@Override
	public List<Admin> getAllAdmins() throws AdminNotFound
	{
		List<Admin> existsAdmin = iadminrepository.findAll();
		if (existsAdmin.isEmpty())
			throw new AdminNotFound("No Admin Exists");
		
		return iadminrepository.findAll();
	}

}
