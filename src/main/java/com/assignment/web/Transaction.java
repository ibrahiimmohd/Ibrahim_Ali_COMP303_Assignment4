package com.assignment.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;


@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="transactionid")
	private int TransactionId;
	
    @NotNull
	@Column(name="customerid")
	private int CustomerId;
	
    @NotNull
	@Column(name="bookid")
	private int BookId;
	
    @NotBlank(message = "TrxnDate is mandatory")
	@Column(name="trxndate")
	private String TrxnDate;
	
    @NotBlank(message = "TrxnType is mandatory")
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