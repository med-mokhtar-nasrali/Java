package com.bookapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookapi.models.Book;

//...
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    // Retrieve all books
    List<Book> findAll();

    // Retrieve books with descriptions containing the search string
    List<Book> findByDescriptionContaining(String search);

    // Find
    Long countByTitleContaining(String search);

    // Delete a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);

}
