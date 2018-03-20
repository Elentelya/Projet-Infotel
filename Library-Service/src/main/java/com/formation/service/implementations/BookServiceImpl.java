package com.formation.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Book;
import com.formation.dao.interfaces.IBookDao;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.service.interfaces.IBookService;

@Service
@Transactional
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookDao bookDao;
	@Autowired
	private IGenericDao genericDao;

	@Override
	public void insert(Book book) throws Exception {
		genericDao.save(book);
	}

	@Override
	public Book getById(int bookId) throws Exception {
		return genericDao.getById(Book.class, bookId);
	}

	@Override
	public List<Book> getAll() throws Exception {
		return genericDao.getAll(Book.class);
	}

	@Override
	public void update(Book book) throws Exception {
		genericDao.saveOrUpdate(book);
	}

	@Override
	public void delete(Book book) throws Exception {
		genericDao.delete(book);
	}

	@Override
	public List<Book> getByTitle(String title) throws Exception {
		return bookDao.getByTitle(title);
	}

	@Override
	public List<Book> search(String search) throws Exception {
		return bookDao.search(search);
	}

	@Override
	public List<Book> popular() throws Exception {
		return bookDao.popular();
	}

	@Override
	public List<Book> getBookByCategory(String categoryName) throws Exception {
		return bookDao.getBookByCategory(categoryName);
	}

}
