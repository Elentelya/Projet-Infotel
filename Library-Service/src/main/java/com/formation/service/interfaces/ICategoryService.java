package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Category;

public interface ICategoryService {

	// IGenericDao
	void insert(Category category) throws Exception;
	Category getById(int categoryId) throws Exception;
	List<Category> getAll() throws Exception;
	void update(Category category) throws Exception;
	void delete(Category category) throws Exception;

	// IDaoCategory
	Category getCategoryByName(String name) throws Exception;

}
