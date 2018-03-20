package com.formation.dao.implementations;

import com.formation.dao.entities.Author;
import com.formation.dao.entities.Book;
import com.formation.dao.interfaces.IAuthorDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class AuthorDaoImpl implements IAuthorDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
	public List<Author> getAuthorsByTitle(String title) {
		Session session = sessionFactory.getCurrentSession();
		
		Query qBook = session.createQuery(
				"FROM Book b WHERE b.title like :title")
				.setParameter("title", title);
		
		List<Book> listBook = qBook.list();
		
		String id = "";
		
		Query qAuthor = session.createQuery(
				"FROM Author a WHERE a.author_id = :id")
				.setParameter("id", id);
		
		List<Author> listAuthor = qAuthor.list();
		
		return listAuthor;
	}

	@Override
	public Author getAuthorByName(String lastname) {
		return (Author) sessionFactory.getCurrentSession().createQuery("FROM Author a WHERE a.lastname = :lastname")
				.setParameter("lastname", lastname).getSingleResult();
	}
}
