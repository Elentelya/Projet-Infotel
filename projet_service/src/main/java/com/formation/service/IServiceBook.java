package com.formation.service;

import java.util.List;

import com.formation.entity.Book;

public interface IServiceBook {

		void insert(Book book);

	    Book findById(int bookId);
	    List<Book> findByTitle(String title);
	    List<Book> findAll();
	    List<Book> search(String search);
	    
	    void update(Book book);

	    void delete(int bookId);
}
