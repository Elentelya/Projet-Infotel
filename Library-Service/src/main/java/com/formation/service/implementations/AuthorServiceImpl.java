package com.formation.service.implementations;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Author;
import com.formation.dao.interfaces.IAuthorDao;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.service.interfaces.IAuthorService;

@Service
@Transactional
public class AuthorServiceImpl implements IAuthorService {

	@Autowired
	private IAuthorDao authorDao;
	@Autowired
	private IGenericDao genericDao;
	
	
	@Override
	public void insert(Author author) throws Exception  {
		genericDao.save(author);
	}
	
	@Override
	public Author getById(int authorId) throws Exception {
		return genericDao.getById(Author.class, authorId);
	}

	@Override
	public List<Author> getAll() throws Exception {
		return genericDao.getAll(Author.class);
	}

	@Override
	public void update(Author author) throws Exception {
		genericDao.saveOrUpdate(author);
	}

	@Override
	public void delete(Author author) throws Exception {
		genericDao.delete(author);
	}

	@Override
	public Author getAuthorByName(String name) throws Exception {
		return authorDao.getAuthorByName(name);
	}
	
	@Override
	public List<Author> getAuthorsByBookTitle(String title) throws Exception {
		return authorDao.getAuthorsByTitle(title);
	}

	// code à Antoine, tester plus tard ...
	@Override
	public List<Author> getAuthorsById(List<Integer> authorsIds) throws Exception {
		return getAll().stream().filter(a -> authorsIds.contains(a.getAuthorId())).collect(Collectors.toList());
	}

}