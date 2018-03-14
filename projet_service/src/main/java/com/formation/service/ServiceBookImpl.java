package com.formation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dao.IDaoBook;
import com.formation.entity.Book;

@Service
public class ServiceBookImpl implements IServiceBook {

	@Autowired
	IDaoBook iDaoBook;

	@Override
	public void insert(Book book) {
		iDaoBook.insert(book);
	}

	@Override
	public Book findById(int bookId) {
		return iDaoBook.findById(bookId);
	}

	@Override
	public List<Book> findByTitle(String title) {
		return iDaoBook.findByTitle(title);
	}

	@Override
	public List<Book> findAll() {
		return iDaoBook.findAll();
	}

	@Override
	public void update(Book book) {
		iDaoBook.update(book);
	}

	@Override
	public void delete(int bookId) {
		iDaoBook.delete(bookId);
	}

	@Override
	public List<Book> search(String search) {
		return iDaoBook.search(search);
	}

	@Override
	public List<Book> popular() {
		return iDaoBook.popular();
	}

	@Override
	public List<Book> findBookByCategory(String categoryName) {
		return iDaoBook.findBookByCategory(categoryName);
	}
}
