package com.formation.dao.interfaces;

import java.util.List;

public interface IGenericDao {

	// CRUD Général
    <T> T save(final T o);
    void delete(final Object object);    
    public <T> T getById(final Class<T> type, final int id);
    <T> void saveOrUpdate(final T o);
    <T> List<T> getAll(final Class<T> type);
    
}
