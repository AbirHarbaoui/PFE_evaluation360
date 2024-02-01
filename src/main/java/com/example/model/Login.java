package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.Min;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name="employees")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="firstname")
	@NotNull
	@Size(min = 2, max = 30)
	private String firstname;
	
	@Column(name="lastname")
	@NotNull
	@Size(min = 2, max = 30)
	private String lastname;
	
	@Column(name="age")
	@NotNull
	@Min(18)
	@Max(65)
	private int age ;
	
	@Column(name="email")
	@NotNull
	@Email
	@Size(min=10)
	private String email;
	
	
	
	@Column(name="phone")
	@NotNull
	@Size(min=8,max=8)
	private String phone;
	
	
	@Column(name="adresse")
	@NotNull
	@Size(min=3,max=200)
	private String adresse ;
	
	@Column(name="genre")

	private String genre ;
	
	@Column(name="password")
	@NotNull
	@Size(min=8,max=30)
	private String password ;
	
	public Login() {
		super();
	}

	public Login(long id, String firstname, String lastname, int age, String email, String phone, String adresse,
			String genre, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.adresse = adresse;
		this.genre = genre;
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
}
