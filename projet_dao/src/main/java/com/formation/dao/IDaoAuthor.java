package com.formation.dao;

import java.util.List;

import com.formation.entity.Author;
import com.formation.entity.Book;

public interface IDaoAuthor {

    List<Author> findBookAuthor(String title);

}
