package com.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rk.beans.Book;
import com.rk.persistance.BookDao;

@RestController
public class BookController {
	
	@Autowired
	private BookDao dao;
	@GetMapping("/books")
	public Book getBook() {
		Book book = new Book(1,"JAVA",500);
		return book;
	}
	
	@PostMapping("/addBook/")
	public String addBook(@RequestBody Book book) {
		dao.save(book);
		return "Book Added Successfully";
	}
}
