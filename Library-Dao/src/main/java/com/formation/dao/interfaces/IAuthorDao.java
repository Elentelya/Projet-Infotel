package com.formation.dao.interfaces;

import java.util.List;

import com.formation.dao.entities.Author;

public interface IAuthorDao {

    List<Author> getAuthorsByTitle(String title);
    Author getAuthorByName(String lastname);
    
}
