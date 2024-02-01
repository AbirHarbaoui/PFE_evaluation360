package com.example.service;

import java.util.List;

import com.example.model.Contact;

public interface ContactService {

	List <Contact> getAllContact();
	
	void saveContact(Contact contact);
	
	Contact getContactById(Integer id);
	
	void deleteContactById(Integer id);
}
