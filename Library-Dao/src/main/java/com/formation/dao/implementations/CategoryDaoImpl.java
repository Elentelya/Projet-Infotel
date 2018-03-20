package com.formation.dao.implementations;

import com.formation.dao.entities.Category;
import com.formation.dao.interfaces.ICategoryDao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements ICategoryDao {

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
	@Override
    public Category getCategoryByName(String name) {
    	return (Category) sessionFactory.getCurrentSession().createQuery("FROM Category c WHERE c.name = :name ")
				.setParameter("name", name).getSingleResult();
    }
    
//    @SuppressWarnings("unchecked")
//	@Override
//    public List<Category> getAllBookByCategory(String category) {
//    	return (List<Category>) sessionFactory.getCurrentSession().createQuery(String.format("SELECT Category.books as books FROM Category as cat" +
//                " where cat.name = :name"))
//				.setParameter("name", category).list();
//    }
}
