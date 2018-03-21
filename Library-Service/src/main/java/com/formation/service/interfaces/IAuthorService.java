package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Author;

public interface IAuthorService {

		// IGenericDao
		void insert(Author author) throws Exception;
		Author getById(int authorId) throws Exception;
		List<Author> getAll() throws Exception;
		void update(Author author) throws Exception;
		void delete(Author author) throws Exception;
		
		// IDaoAuthor
		Author getAuthorByName(String name) throws Exception;
		List<Author> getAuthorsByBookTitle(String title) throws Exception;
		
		// Ajout
		List<Author> getAuthorsById(List<Integer> authorsIds) throws Exception;
}
