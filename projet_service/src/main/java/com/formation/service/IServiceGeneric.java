package com.formation.service;
import java.util.List;

public interface IServiceGeneric<T> {

    void insert(T t);

    T findById(int id);
    List<T> findAll();
    
    void update(T t);

    void delete(int id);
}