package com.example.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.model.Login;
import com.example.service.EmployeeService;



@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService ;
	
	
	@GetMapping("/log")
	public String log() {
		return "login" ;
	}

	
	
	
	// display list of employees
		@GetMapping("/ress1")
		public String viewHomePage0(Model model) {
			model.addAttribute("listEmployees",employeeService.getAllEmployees());
			return "ressourceshumaines" ;
		}
		
		
		
	
	// display list of employees
	@GetMapping("/index")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees",employeeService.getAllEmployees());
		return "index" ;
	}
	
	
	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Login employee = new Login();
		model.addAttribute("employee",employee);
		return "ajouter" ; 
	}


	
	
		@PostMapping("/saveEmployee")
		public String saveEmployee(@Valid @ModelAttribute("employee") Login employee , BindingResult bindingResult) {
			 if (bindingResult.hasErrors()) {
		            return "ajouter";
		        }else {
		        	employeeService.saveEmployee(employee);
		        	  return "acceuil";
		        }
		      
		}
		


		
		
		@GetMapping("/showFormForUpdate/{id}")
		public String showFormForUpdate(@PathVariable (value="id") long id , Model model) {
			//get  employee from the service
        Login employee = employeeService.getEmployeeById(id);
         //set employee as a model attribute to pre populate the form
         model.addAttribute("employee",employee);
         return "modifier";
        }
		
		
		@GetMapping("/deleteEmployee/{id}")
		public String deleteEmployee(@PathVariable (value="id") long id ) {
			
			//call delete employee method

			this.employeeService.deleteEmployeeById(id);
			return "acceuil";
		}
		
		
}
		