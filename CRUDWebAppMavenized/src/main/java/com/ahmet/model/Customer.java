package com.ahmet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int customerId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private String Country;

	@Column
	private String bookname;
	
	public Customer(){}

	public Customer(int customerId, String firstname, String lastname,
			String country, String bookname) {
		super();
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastname = lastname;
		Country = country;
		this.bookname = bookname;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
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
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	
}
