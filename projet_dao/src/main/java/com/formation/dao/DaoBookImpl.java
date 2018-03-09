package com.formation.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.entity.Book;

@Repository
@Transactional
public class DaoBookImpl implements IDaoBook {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void insert(Book book) {
		sessionFactory.getCurrentSession().save(book);
	}

	@Override
	public Book findById(int bookId) {
		return sessionFactory.getCurrentSession().find(Book.class, bookId);
	}

	@Override
	public List<Book> findByTitle(String title) {
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
				.createQuery("FROM Book book WHERE book.title = :title").setParameter("title", title).list();
		return listeLivres;
	}

	@Override
	public List<Book> findAll() {
		@SuppressWarnings("unchecked")
        List<Book> listeLivres = sessionFactory.getCurrentSession().createQuery("FROM Book book").list(); 
        return listeLivres;
	}

	@Override
	public void update(Book book) {
		sessionFactory.getCurrentSession().update(book);
	}

	@Override
	public void delete(int bookId) {
		sessionFactory.getCurrentSession().delete(bookId);
	}

	@Override
	public List<Book> search(String search) {
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
				.createQuery("FROM Book book WHERE book.title LIKE :title").setParameter("title", "%"+search+"%").list();
		return listeLivres;
	}

	@Override
	public List<Book> popular() {
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
				.createQuery("FROM Book book WHERE book.popularBook = 1").list();
		return listeLivres;
	}
}
