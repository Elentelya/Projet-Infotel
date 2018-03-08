package com.formation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.dao.IDaoGeneric;



@Service
public class ServiceGenericImpl<T> implements IServiceGeneric<T> {

    private Class<T> type;

    @Autowired
    private IDaoGeneric<T> iDaoGeneric;

    @Override
    public void insert(T t) {
        iDaoGeneric.insert(t);
    }

    @Override
    public T findById(int id) {
        return iDaoGeneric.findById(id);
    }

    @Override
    public List<T> findAll() {
        return iDaoGeneric.findAll();
    }

    @Override
    public void update(T t) {
        iDaoGeneric.update(t);
    }

    @Override
    public void delete(int id) {
        iDaoGeneric.delete(id);
    }
}