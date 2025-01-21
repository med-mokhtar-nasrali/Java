package com.bookclub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.bookclub.models.Book;
import com.bookclub.models.User;
import com.bookclub.services.BookService;
import com.bookclub.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@Autowired
	UserService userService;

	
	
	//get home page
	@GetMapping("/books")
	public String getBooks(HttpSession session,Model model) {
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			return "redirect:/logout";
		}
		User connectedUser = userService.findById((Long) session.getAttribute("userId"));
		model.addAttribute("connected",connectedUser);
		model.addAttribute("books",bookService.getAllBooks());
		return "books";
	}
	
	//get create page
	@GetMapping("/book/new")
	public String create(@ModelAttribute("book")Book book, HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		if(userId == null) {
			return "redirect:/logout";
		}
		return "createbook";
	}
	
	//post create book
	@PostMapping("/book/new")
	public String create(@Valid @ModelAttribute("book")Book book, BindingResult result, HttpSession session) {
		// if there is validation errors 
		if(result.hasErrors()) {
			return "createbook";
		}
		// we will get the connected user
		User connectedUser = userService.findById((Long) session.getAttribute("userId"));
		book.setCreator(connectedUser);
		bookService.createBook(book);
		return "redirect:/books";
				
	}
	
	//Display one book
	@GetMapping("/books/{bookId}")
	public String showBook(@PathVariable("bookId")Long bookId, Model model, HttpSession session) {
		Book book = bookService.findById(bookId);
		User connectedUser = userService.findById((Long) session.getAttribute("userId"));
		model.addAttribute("connected", connectedUser);
		model.addAttribute("book",book);
		return "showbook";
	}
	
	
	//Display Edit Page
	@GetMapping("/edit/{bookId}")
	public String getEditPage(@PathVariable("bookId")Long bookId, Model model) {
		// we will get the book using the id 
		Book book = bookService.findById(bookId);
		//set the book to the model attribute 
		model.addAttribute("book",book);
		//return edit page
		return "edit";
	}
	
	
	//Post edit
	@PutMapping("/edit/{bookId}")
	public String editBook(@Valid @ModelAttribute("book")Book book,BindingResult result,
							@PathVariable("bookId")Long bookId,HttpSession session) {
		if(result.hasErrors()) {
			return "edit";
		}	
		book.setCreator(userService.findById((Long) session.getAttribute("userId")));
		bookService.updateBook(bookId, book);
		return "redirect:/books";
	}
	
	
	// delete a book
			@GetMapping("/delete/{bookId}")
			public String deleteSong(@PathVariable("bookId") Long bookId) {
				bookService.deleteBook(bookId);
				return "redirect:/books";
			}
	
	
	
	
	
	
}
