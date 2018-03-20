package com.formation.dao.implementations;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.formation.dao.entities.Library;
import com.formation.dao.interfaces.ILibraryDao;

@Repository
@Transactional
public class LibraryDaoImpl implements ILibraryDao{
	
	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public Library getLibraryByName(String name) {
			return (Library) sessionFactory.getCurrentSession().createQuery("FROM Library l where l.name = :name").setParameter("name", name).getSingleResult();
	}
}
