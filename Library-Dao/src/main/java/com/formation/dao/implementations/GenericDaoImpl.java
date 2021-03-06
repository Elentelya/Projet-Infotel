package com.formation.dao.implementations;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.interfaces.IGenericDao;

import java.util.List;

@Repository
@Transactional
public class GenericDaoImpl implements IGenericDao{

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
	@Override
    public <T> T save(final T o){
        return (T) sessionFactory.getCurrentSession().save(o);
    }

    @Override
    public void delete(final Object object){
        sessionFactory.getCurrentSession().delete(object);
    }

    @Override
    public <T> T getById(final Class<T> type, final int id){
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    @Override
    public <T> void saveOrUpdate(final T o){
        sessionFactory.getCurrentSession().saveOrUpdate(o);
    }

    @SuppressWarnings({ "deprecation", "unchecked" })
	@Override
    public <T> List<T> getAll(final Class<T> type) {
        final Session session = sessionFactory.getCurrentSession();
        final Criteria crit = session.createCriteria(type);
        return crit.list();
    }
}
