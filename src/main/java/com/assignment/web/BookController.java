package com.assignment.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BookController {
	
	@Autowired 
	private BookRepository bookRepository;
	
	@GetMapping(value = "/list_books_library")
	public ModelAndView listBooks(Model model)
	{
		ModelAndView mview = new ModelAndView("books");
				
		mview.addObject("listBooks", bookRepository.findAll());
		
		return mview;
	}
	
	@GetMapping(value = "/list_books_availability")
	public ModelAndView listBooksAvailability(Model model)
	{
		ModelAndView mview = new ModelAndView("books_availability");
		
//		List<Book> checkBooksAvailability = bookRepository.ListLentOutBooks("Available");
		
		List<Book> checkBooksAvailability = bookRepository.findAll();
		
		mview.addObject("listLentBooks", checkBooksAvailability);
		
		return mview;
	}
}