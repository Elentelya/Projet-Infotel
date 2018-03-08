package com.formation.dao;

import java.util.List;

import com.formation.entity.Book;

public interface IDaoBook {

	    void insert(Book book);

	    Book findById(int bookId);
	    List<Book> findByTitle(String title);
	    List<Book> findAll();
	    
	    void update(Book book);

	    void delete(int bookId);
	    
}
