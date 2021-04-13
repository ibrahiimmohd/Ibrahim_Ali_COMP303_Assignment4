package com.assignment.web;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

@Entity
@Table(name="book")
public class Book {
	@Id
	@Column(name="bookid")
	private int BookId;
	@Column(name="title")
	private String Title;
	@Column(name="authorlastname")
	private String AuthorLastName;
	@Column(name="authorfirstname")
	private String AuthorFirstName;
	@Column(name="rating")
	private int Rating;
	@Column(name="availability")
	private String Availability;
	
	public Book() {}
	
	public Book(String title, String authorFirstName, String authorLastName, int rating, String availability) {
		this.Title = title;
		this.AuthorFirstName = authorFirstName;
		this.AuthorLastName = authorLastName;
		this.Rating = rating;
		this.Availability = availability;
	}

	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		this.BookId = bookId;
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

	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		this.Rating = rating;
	}
	
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		this.Availability = availability;
	}
}
