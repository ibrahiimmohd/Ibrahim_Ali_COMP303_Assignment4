package com.assignment.web;

import javax.persistence.Column;
import javax.persistence.Id;

public class TransactionPretty {
	
	private String FirstName;

	private String LastName;
	
	private String Title;
	
	private String AuthorFirstName;

	private String AuthorLastName;

	private String TrxnDate;

	private String TrxnType;
	
	public TransactionPretty() {}
	
	public TransactionPretty(String firstName, String lastName, String title, String authorFirstName, String authorLastName, String trxnDate, String trxnType) {
		super();
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Title = title;
		this.AuthorLastName = authorLastName;
		this.AuthorFirstName = authorFirstName;
		this.TrxnDate = trxnDate;
		this.TrxnType = trxnType;
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

	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}
	
	public String getAuthorFirstName() {
		return AuthorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.AuthorFirstName = authorFirstName;
	}
	
	public String getAuthorLastName() {
		return AuthorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.AuthorLastName = authorLastName;
	}
	
	public String getTrxnDate() {
		return TrxnDate;
	}
	public void setTrxnDate(String trxnDate) {
		this.TrxnDate = trxnDate;
	}

	public String getTrxnType() {
		return TrxnType;
	}
	public void setTrxnType(String trxnType) {
		this.TrxnType = trxnType;
	}
}
