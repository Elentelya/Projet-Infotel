package com.formation.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.formation.entity.Author;
import com.formation.entity.Book;

public class DaoAuthorImpl implements IDaoAuthor {

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public List<Author> findBookAuthor(String title) {
		@SuppressWarnings("unchecked")
		Session session = sessionFactory.getCurrentSession();
		
		Query qBook = session.createQuery(
				"FROM book b WHERE b.title like :title")
				.setParameter("title", title);
		
		List<Book> listBook = qBook.list();
		
		String id = "";
		
		Query qAuthor = session.createQuery(
				"FROM author a WHERE a.id like :id")
				.setParameter("id", id);
		
		List<Author> listAuthor = qAuthor.list();
		
		return listAuthor;
	}

}
