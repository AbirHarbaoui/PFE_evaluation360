package com.example.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Login;
import com.example.repository.EmployeeRepository;

@Service
public  class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository ;
	
	  
	
	//affich liste 
	@Override
	public List<Login> getAllEmployees(){
	return employeeRepository.findAll();
	
}
	//enregistrer
	@Override
	 public void saveEmployee(Login employee) {
		this.employeeRepository.save(employee);	
}
	
	//modifier
	@Override
	public Login getEmployeeById(long id) {
		Optional<Login> optional =employeeRepository.findById(id);
		Login employee = null ;
	if(optional.isPresent()) {
		employee=optional.get();
		
	}else {
		throw new RuntimeException("Employee not found for id : : "+ id);
	}
	return employee;
	}
	
	//supprimer
	@Override
	public void deleteEmployeeById(long id) {
	this.employeeRepository.deleteById(id);
		
	}
	

	
	
	
	
	
}
