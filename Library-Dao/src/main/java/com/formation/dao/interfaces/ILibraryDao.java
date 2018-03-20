package com.formation.dao.interfaces;

import com.formation.dao.entities.Library;

public interface ILibraryDao {

    Library  getLibraryByName(String name);
}
