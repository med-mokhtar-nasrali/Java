package com.bookapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapi.models.Book;
import com.bookapi.repositories.BookRepository;


@Service
public class BookService {
 // adding the book repository as a dependency
 private final BookRepository bookRepository;
 
 @Autowired
	BookRepository bookRepo;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 // update book 
 public Book updateBook(Book book) {
	 return bookRepository.save(book) ;
 }
 
 
// delete book 
 public void deleteBook(Long id) {
	 Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			bookRepository.deleteById(id);
		}        
 }
   
 //Get book by id
 public Book getBookById(Long id) {
	 Optional<Book> book = bookRepo.findById(id);
	 if(book.isEmpty()) {
		 return null;
	 }
	 return book.get();
 }
 
}

