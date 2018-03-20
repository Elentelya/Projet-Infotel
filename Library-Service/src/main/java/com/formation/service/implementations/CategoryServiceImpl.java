package com.formation.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Category;
import com.formation.dao.interfaces.ICategoryDao;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.service.interfaces.ICategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	private ICategoryDao categoryDao;
	@Autowired
	private IGenericDao genericDao;
	
	@Override
	public void insert(Category category) throws Exception {
		genericDao.save(category);
	}
	
	@Override
	public Category getById(int categoryId) throws Exception {
		return genericDao.getById(Category.class, categoryId);
	}
	@Override
	public List<Category> getAll() throws Exception {
		return genericDao.getAll(Category.class);
	}
	
	@Override
	public void update(Category category) throws Exception {
		genericDao.saveOrUpdate(category);
	}
	
	@Override
	public void delete(Category category) throws Exception {
		genericDao.delete(category);
	}
	
	@Override
	public Category getCategoryByName(String name) throws Exception {
		return categoryDao.getCategoryByName(name);
	}

}

	


