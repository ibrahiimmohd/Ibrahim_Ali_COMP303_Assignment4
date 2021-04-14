/*  
 * Ibrahim Ali
 * 301022172
 * 13-04-2021
 * */

package com.assignment.web;

import java.util.List;
import com.assignment.web.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Integer> {

	@Query("select b from Book b where b.Availability = ?1")
	List<Book> ListLentOutBooks(String bookLent);
}