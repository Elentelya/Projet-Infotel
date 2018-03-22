package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Registration;

public interface IRegistrationService {

	// IGenericDao
	void insert(Registration registration) throws Exception;
	Registration getById(int registrationId) throws Exception;
	List<Registration> getAll() throws Exception;
	void update(Registration registration) throws Exception;
	void delete(Registration registration) throws Exception;
	
}
