package com.assignment.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookLendingInformationSystem implements CommandLineRunner{
	
	@Autowired 
	private TransactionRepository transactionRepository;
	
	@Autowired 
	private CustomerRepository customerRepository;
	
	@Autowired 
	private BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookLendingInformationSystem.class, args);
		System.setProperty("spring.config.name", "book-lending-information-system");
		
	    System.out.println("Ibrahim Ali's book-lending-information-system web app started");
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		transactionRepository.deleteAll();
		customerRepository.deleteAll();
		bookRepository.deleteAll();
		
		// Seed necessary data
		
		Customer cus1 = new Customer("Liam", "Miller", "1 Danfoth Ave", "6478523690", "liam.miller@email.com");
		Customer cus2 = new Customer("Fiona", "Smith", "22 Queen Street", "6479513578", "fiona.smith@email.com");
		Customer cus3 = new Customer("Ivor", "Watson","2 Leslie Street", "6479576483", "ivor.watson@email.com");
		Customer cus4 = new Customer("Mike", "Bailey","5 Bloor Street", "6476489513", "mike.bailey@email.com");
		
		customerRepository.save(cus1);
		customerRepository.save(cus2);
		customerRepository.save(cus3);
		customerRepository.save(cus4);
		
		List<Customer> listCustomers = customerRepository.findAll();
		
		Book book1 = new Book("Who Was Albert Einstein?", "Jess", "Brallier", 5, "Not Available");
		Book book2 = new Book("Think and Grow Rich","Napoleon", "Hill", 4, "Available");
		Book book3 = new Book("Wishes Won't Bring Riches!","Napoleon", "Hill", 3, "Available");
		Book book4 = new Book("Mastery","Robert", "Greene", 5, "Not Available");
		
		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);
		bookRepository.save(book4);
		
		List<Book> listBooks = bookRepository.findAll();

		Transaction trxn1 = new Transaction(listCustomers.get(0).getCustomerId(), listBooks.get(1).getBookId(), "01-01-2021", "Check-out");
		Transaction trxn2 = new Transaction(listCustomers.get(1).getCustomerId(), listBooks.get(2).getBookId(), "04-01-2021", "Check-out");
		Transaction trxn3 = new Transaction(listCustomers.get(2).getCustomerId(), listBooks.get(0).getBookId(), "12-01-2021", "Check-out");
		Transaction trxn4 = new Transaction(listCustomers.get(0).getCustomerId(), listBooks.get(1).getBookId(), "05-02-2021", "Check-in");
		Transaction trxn5 = new Transaction(listCustomers.get(1).getCustomerId(), listBooks.get(2).getBookId(), "08-03-2021", "Check-in");
		Transaction trxn6 = new Transaction(listCustomers.get(3).getCustomerId(), listBooks.get(2).getBookId(), "15-03-2021", "Check-out");
		
		transactionRepository.save(trxn1);
		transactionRepository.save(trxn2);
		transactionRepository.save(trxn3);
		transactionRepository.save(trxn4);
		transactionRepository.save(trxn5);
		transactionRepository.save(trxn6);
		
	    System.out.println("Ibrahim Ali's book-lending-information-system seed completed");

	}
}
