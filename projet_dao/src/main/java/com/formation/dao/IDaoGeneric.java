package com.formation.dao;

import java.util.List;

public interface IDaoGeneric<T> {

    void insert(T t);

    T findById(int id);
    List<T> findAll();
    
    void update(T t);

    void delete(int id);
}