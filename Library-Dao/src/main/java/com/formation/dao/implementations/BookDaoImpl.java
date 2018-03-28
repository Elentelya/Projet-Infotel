package com.formation.dao.implementations;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.client.RestHighLevelClient;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.formation.dao.entities.Book;
import com.formation.dao.entities.Category;
import com.formation.dao.interfaces.IBookDao;

//@Repository
//@Transactional
public class BookDaoImpl implements IBookDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Book> getByTitle(String title) {
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
				.createQuery("FROM Book b WHERE b.title = :title").setParameter("title", title).list();
		return listeLivres;
	}
	
	public List<Book> search(String search) {
		List<Book> books = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
				.createQuery("FROM Book b WHERE b.title LIKE :title").setParameter("title", "%"+search+"%").list();
		return listeLivres;
	}
	
	@Override
	public List<Book> popular() {
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
				.createQuery("FROM Book b WHERE b.popularBook = 1").list();
		return listeLivres;
	}

	@Override
	public List<Book> getBookByCategory(String categoryName) {
		Category category = (Category) sessionFactory.getCurrentSession().createQuery("FROM Category c WHERE c.name = :name").setParameter("name", categoryName);
		@SuppressWarnings("unchecked")
		List<Book> listeLivres = sessionFactory.getCurrentSession()
                .createQuery("FROM Book b WHERE b.bookCategory_category_id = :category").setParameter("category", category.getCategoryId()).list();
        return listeLivres;
	}

}