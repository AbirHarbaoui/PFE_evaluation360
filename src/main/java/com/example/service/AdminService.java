package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Admin;

import com.example.repository.AdminRepository;


 
@Service
public class AdminService {
@Autowired
private AdminRepository repo;
  
  public Admin login(String username, String password) {
  Admin admin = repo.findByUsernameAndPassword(username, password);
   return admin;
  }

public List<Admin> getAllEmployees(){
	return repo.findAll();
	
}
 
}
