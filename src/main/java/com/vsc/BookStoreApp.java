package com.vsc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vsc.models.Book;
import com.vsc.repositories.BookRepository;

@SpringBootApplication
public class BookStoreApp{ //implements CommandLineRunner {

	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	Book book;
	
	

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApp.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		book.setAuthor("Chetan Bhagat");
//		book.setCategory("Fiction");
//		book.setCode("XYZ");
//		book.setCreatedDT("12-July-2014");
//		book.setDescription("Love between the States and Different Cultures");
//		book.setImage("https:www.pinterest.com?sdjbvdfbv=3");
//		book.setUrl("www.pintetrest.com");
//		//book.setId("1234");
//		book.setTags("FlipkartStarred");
//		book.setName("Two States");
//		book.setType("Romantic");
//	
//		//bookRepository.save(book);
//		
//		System.out.println("Book Name : "+bookRepository.findAll());
//		
//	}

}
