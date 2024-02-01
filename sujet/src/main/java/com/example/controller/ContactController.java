package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.model.Contact;
import com.example.service.ContactService;

@Controller
public class ContactController {
	
	
	@Autowired
	private ContactService contactService ;
	
	@GetMapping("/contact")
	public String viewHomePge(Model model) {
		model.addAttribute("contacts", contactService.getAllContact());
		return "contact";
		
	}
	
	@GetMapping("/ajouc")
	public String ajouc(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "ajoutercontact";
	}
	
	
	@PostMapping("/saveContact")
	public String saveContact(@ModelAttribute("contact") Contact contact) {
		contactService.saveContact(contact);
		return "acceuil";
		
	}
	
	@GetMapping("/ajoutc/{id}")
	public String ajoutc(@PathVariable (value="id") Integer id , Model model) {
		Contact contact =contactService.getContactById(id);
		model.addAttribute("contact", contact);
		return "modifiercontact";
		
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable (value="id")   Integer id) {
		this.contactService.deleteContactById(id);
		return "acceuil";
		
		
	}
	
	
	
	
	
		}
		

