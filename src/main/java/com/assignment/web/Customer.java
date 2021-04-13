package com.assignment.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="customerid")
	private int CustomerId;
	@Column(name="firstname")
	private String FirstName;
	@Column(name="lastname")
	private String LastName;
	@Column(name="address")
	private String Address;
	@Column(name="phone")
	private String Phone;
	@Column(name="emailid")
	private String EmailId;
	

	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String address, String phone, String emailId) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Address = address;
		this.Phone = phone;
		this.EmailId = emailId;
	}
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		this.CustomerId = customerId;
	}

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		this.Address = address;
	}

	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		this.Phone = phone;
	}

	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		this.EmailId = emailId;
	}
}

