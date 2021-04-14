/*  
 * Ibrahim Ali
 * 301022172
 * 13-04-2021
 * */

package com.assignment.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@Autowired 
	private CustomerRepository customerRepository;

	@GetMapping(value = "/")
	public ModelAndView index(Model model)
	{
		ModelAndView mview = new ModelAndView("index");
						
		return mview;
	}

	@GetMapping(value = "/index")
	public ModelAndView home(Model model)
	{
		ModelAndView mview = new ModelAndView("index");
						
		return mview;
	}

}