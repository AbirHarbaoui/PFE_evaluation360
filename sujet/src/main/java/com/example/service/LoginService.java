package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Login;
import com.example.repository.LoginRepository;
 

 
 
@Service
public class LoginService {
@Autowired
private LoginRepository repo;
  
  public Login login(String email, String password) {
  Login user = repo.findByEmailAndPassword(email, password);
   return user;
  }
 
}