package com.formation.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class IDaoGenericImpl<T> implements IDaoGeneric<T> {

   private Class<T> type;
    
    @Autowired
    SessionFactory sessionFactory;
        
    @Override
    public void insert(T t) {
        sessionFactory.getCurrentSession().save(t);
    }

    @Override
    public T findById(int id) {
        return sessionFactory.getCurrentSession().find(type, id);
    }

    @Override
    public List<T> findAll() {        
        @SuppressWarnings("unchecked")
        List<T> liste = sessionFactory.getCurrentSession().createQuery("FROM " + type.getName() + " " + type).list(); 
        return liste;
    }

    @Override
    public void update(T t) {
        sessionFactory.getCurrentSession().update(t);
    }

    @Override
    public void delete(int id) {
        sessionFactory.getCurrentSession().delete(id);
    }
}