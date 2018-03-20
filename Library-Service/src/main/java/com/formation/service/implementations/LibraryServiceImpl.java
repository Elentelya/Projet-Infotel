package com.formation.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Library;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.dao.interfaces.ILibraryDao;
import com.formation.service.interfaces.ILibraryService;

@Service
@Transactional
public class LibraryServiceImpl implements ILibraryService {

    @Autowired
    private IGenericDao genericDao;
    
    @Autowired
    private ILibraryDao libraryDao;

	@Override
	public void insert(Library library) throws Exception {
		genericDao.save(library);
	}

	@Override
	public Library getById(int libraryId) throws Exception {
		return genericDao.getById(Library.class, libraryId);
	}

	@Override
	public List<Library> getAll() throws Exception {
		return genericDao.getAll(Library.class);
	}

	@Override
	public void update(Library library) throws Exception {
		genericDao.saveOrUpdate(library);
	}

	@Override
	public void delete(Library library) throws Exception {
		genericDao.delete(library);
	}

	@Override
	public Library getLibraryByName(String name) throws Exception {
		return libraryDao.getLibraryByName(name);
	}
   
}
