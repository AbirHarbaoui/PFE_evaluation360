package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nom")
	private String nom ;
	
	@Column(name="email")
	private String email ;
	
	@Column(name="message")
	private String message ;
	
	@Column(name="DDD")
	private String DDD ;

	public Contact() {
		super();
	}

	

	public Contact(Integer id, String nom, String email, String message, String dDD) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.message = message;
		DDD = dDD;
	}



	public String getDDD() {
		return DDD;
	}



	public void setDDD(String dDD) {
		DDD = dDD;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
