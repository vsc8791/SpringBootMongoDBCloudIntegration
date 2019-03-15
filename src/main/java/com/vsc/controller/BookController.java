package com.vsc.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vsc.models.Book;
import com.vsc.repositories.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	Book book;
	
	
	@RequestMapping("/book")
	public List<Book> getAll()
	{
		return bookRepository.findAll();
		
	}
	
	@PostMapping("/insert")
	public Book create(@Valid @RequestBody Book book)
	{
		return bookRepository.save(book);
	
	}
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public Optional<Book> getBookById(@PathVariable("id") String id) {
	  return bookRepository.findById(id);
	}
	
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public Optional<Book> getBookByObjectId(@PathVariable("id") ObjectId id) {
	  return bookRepository.findById(id);
	}
	


}
