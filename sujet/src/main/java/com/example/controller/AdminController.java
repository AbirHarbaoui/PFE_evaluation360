package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.model.Admin;
import com.example.repository.AdminRepository;


@Controller
public class AdminController {
	
	@Autowired
	private AdminRepository repo ;

	
	
	@GetMapping("/loooog")
	public String login(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin",admin);
		return "login1";
	}
	
	
	@PostMapping("/userLogin")
	public String loginUser(@ModelAttribute("admin") Admin admin) {
		String userId= admin.getUserId();
		Optional<Admin> userdata =repo.findById(userId);
		if(admin.getPassword().equals(userdata.get().getPassword())) {
			return "modifier";
		}else {
			return "acceuil";
		}
	}
	
	
	
}