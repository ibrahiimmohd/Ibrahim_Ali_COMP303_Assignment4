package com.assignment.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TransactionController {
	
	@Autowired 
	private TransactionRepository transactionRepository;
	
	@GetMapping(value = "/list_transactions")
	public ModelAndView listTransactions(Model model)
	{
		ModelAndView mview = new ModelAndView("transactions");
		
		//List<String> transactionList = transactionRepository.ListSpecificTransactions("Check-out");
		
		List<String> transactionList = transactionRepository.ListTransactions();

		
		ArrayList<TransactionPretty> transactionListPretty = new ArrayList<TransactionPretty>();
		
		for (String item : transactionList) {
			String[] splitItem = item.split(",");
			TransactionPretty newTransactionPretty = new TransactionPretty(splitItem[0],splitItem[1],splitItem[2],splitItem[3],splitItem[4],splitItem[5],splitItem[6]);
			transactionListPretty.add(newTransactionPretty);
		}

		mview.addObject("transactionListPretty", transactionListPretty);

		return mview;
	}
}
