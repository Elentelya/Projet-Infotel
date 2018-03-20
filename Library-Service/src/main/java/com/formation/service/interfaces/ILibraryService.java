package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Library;

public interface ILibraryService {
	
	// IGenericDao
    void insert(Library library) throws Exception;
    Library getById(int libraryId) throws Exception;
    List<Library> getAll() throws Exception;
    void update(Library library) throws Exception;
    void delete(Library library) throws Exception;

    //ILibraryDao
    Library  getLibraryByName(String name) throws Exception;
    
}
