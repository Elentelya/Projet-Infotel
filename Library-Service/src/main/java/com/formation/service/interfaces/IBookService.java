package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Book;

public interface IBookService {
	
	// IGenericDao
    void insert(Book book) throws Exception;
    Book getById(int bookId) throws Exception;
    List<Book> getAll() throws Exception;
    void update(Book book) throws Exception;
    void delete(Book book) throws Exception;

    //IBookDao
    List<Book> getByTitle(String title) throws Exception;	    
    List<Book> search(String search) throws Exception;
    List<Book> popular() throws Exception;
    List<Book> getBookByCategory(String categoryName) throws Exception;

}
