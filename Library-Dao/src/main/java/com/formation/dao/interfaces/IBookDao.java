package com.formation.dao.interfaces;

import java.util.List;

import com.formation.dao.entities.Book;

public interface IBookDao {
    
    List<Book> getByTitle(String title);	    
    List<Book> search(String search);
    List<Book> popular();
    List<Book> getBookByCategory(String categoryName);
}
