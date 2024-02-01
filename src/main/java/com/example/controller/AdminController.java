package com.example.controller;

import java.util.Objects;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.example.model.Admin;
import com.example.service.AdminService;
import com.example.service.EmployeeService;

 
 
 
@Controller
public class AdminController {
@Autowired
    private AdminService adminService;


 

@GetMapping("/log1")
public String ress1() {
	return "login1" ;
}


	

                                  
    @GetMapping("/login1")
          
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login1");
        mav.addObject("admin", new Admin());
        return mav;
    }
 
    @PostMapping("/login1")
    public String login(@ModelAttribute("admin") Admin admin ) {
    
     Admin oauthUser = adminService.login(admin.getUsername(), admin.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "redirect:/ress1";
    
    
     } else {
     return "redirect:/ress1";
    
    
     }
 
}
    
  
}