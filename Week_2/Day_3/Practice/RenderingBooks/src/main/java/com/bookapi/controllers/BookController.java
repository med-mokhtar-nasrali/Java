package com.bookapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bookapi.models.Book;
import com.bookapi.services.BookService;

@Controller
public class BookController {
@Autowired
BookService bookService;
	
	@GetMapping("/books/{id}")
	public String getOneBook(@PathVariable("id")Long id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute(book);
		return "show";
		
	}
}
