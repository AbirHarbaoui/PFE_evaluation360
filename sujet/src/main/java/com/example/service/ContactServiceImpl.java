package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Contact;
import com.example.repository.ContactRepository;


@Service
public class ContactServiceImpl implements ContactService{

	
	@Autowired
	private ContactRepository contactRepository ;

	@Override
	public List<Contact> getAllContact() {
		return contactRepository.findAll();
	}

	@Override
	public void saveContact(Contact contact) {
		this.contactRepository.save(contact);
	}

	@Override
	public Contact getContactById(Integer id) {
		Optional <Contact> optional=contactRepository.findById(id);
		Contact contact=null;
		if(optional.isPresent()) {
			contact=optional.get();
		}else {
			throw new RuntimeException("Message not found for id ::"+id);	
			}
		return contact;
	}

	@Override
	public void deleteContactById(Integer id) {
		this.contactRepository.deleteById(id);
		
	}
	
	

}
