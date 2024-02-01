package com.example.service;

import java.util.List;

import com.example.model.Admin;
import com.example.model.Login;


public interface EmployeeService {
//affich list
	List<Login> getAllEmployees();
	
	
	// enregistrer employee 
	
	void saveEmployee(Login employee);


   // update employee
	
	Login getEmployeeById(long id);

//delete 
	
	void deleteEmployeeById(long id);




}