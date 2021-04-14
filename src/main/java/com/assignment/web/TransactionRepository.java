/*  
 * Ibrahim Ali
 * 301022172
 * 13-04-2021
 * */

package com.assignment.web;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
	@Query("select c.FirstName, c.LastName, b.Title, b.AuthorFirstName, b.AuthorLastName, t.TrxnDate, t.TrxnType from Transaction t join Customer c on t.CustomerId = c.CustomerId join Book b on t.BookId = b.BookId where t.TrxnType = ?1")
	List<String> ListSpecificTransactions(String trxnType);
	
	@Query("select c.FirstName, c.LastName, b.Title, b.AuthorFirstName, b.AuthorLastName, t.TrxnDate, t.TrxnType from Transaction t join Customer c on t.CustomerId = c.CustomerId join Book b on t.BookId = b.BookId")
	List<String> ListTransactions();
}