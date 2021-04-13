package com.assignment.web;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@Column(name="transactionid")
	private int TransactionId;
	@Column(name="customerid")
	private int CustomerId;
	@Column(name="bookid")
	private int BookId;
	@Column(name="trxndate")
	private String TrxnDate;
	@Column(name="trxntype")
	private String TrxnType;
	
	public Transaction() {}
	
	public Transaction(int customerId, int bookId, String trxnDate, String trxnType) {
		super();
		this.CustomerId = customerId;
		this.BookId = bookId;
		this.TrxnDate = trxnDate;
		this.TrxnType = trxnType;
	}

	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		this.TransactionId = transactionId;
	}

	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		this.CustomerId = customerId;
	}

	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		this.BookId = bookId;
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