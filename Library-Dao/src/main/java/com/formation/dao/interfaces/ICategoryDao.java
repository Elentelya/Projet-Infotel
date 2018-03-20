package com.formation.dao.interfaces;

import java.util.List;

import com.formation.dao.entities.Category;

public interface ICategoryDao {

    Category getCategoryByName(String name);
//    List<Category> getAllBookByCategory(String categoryname);
}
