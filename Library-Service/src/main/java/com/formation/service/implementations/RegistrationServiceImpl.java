package com.formation.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Registration;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.service.interfaces.IRegistrationService;

@Service
@Transactional
public class RegistrationServiceImpl implements IRegistrationService {

	@Autowired
	private IGenericDao genericDao;

	@Override
	public void insert(Registration registration) throws Exception {
		genericDao.save(registration);
	}

	@Override
	public Registration getById(int registrationId) throws Exception {
		return genericDao.getById(Registration.class, registrationId);
	}

	@Override
	public List<Registration> getAll() throws Exception {
		return genericDao.getAll(Registration.class);
	}

	@Override
	public void update(Registration registration) throws Exception {
		genericDao.saveOrUpdate(registration);
	}

	@Override
	public void delete(Registration registration) throws Exception {
		genericDao.delete(registration);
	}
	
}