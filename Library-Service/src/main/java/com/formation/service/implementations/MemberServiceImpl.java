package com.formation.service.implementations;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Member;
import com.formation.dao.interfaces.IGenericDao;
import com.formation.dao.interfaces.IMemberDao;
import com.formation.service.exceptions.ErrorConstants;
import com.formation.service.interfaces.IMemberService;

@Service
@Transactional
public class MemberServiceImpl implements IMemberService {

    @Autowired
    private IMemberDao memberDao;
    @Autowired
    private IGenericDao genericDao;

    @Override
    public void insert(Member member) throws Exception {
    	genericDao.save(member);
    }
    
    @Override
    public Member getById(int memberId) throws Exception {
        return genericDao.getById(Member.class, memberId);
    }

    @Override
    public List<Member> getAll() throws Exception {
        return genericDao.getAll(Member.class);
    }
    
    @Override
    public void update(Member member) throws Exception {
    	genericDao.saveOrUpdate(member);
    }
    
    @Override
    public void delete(Member member) throws Exception {
    	genericDao.delete(member);
    }
    

    @Override
    public Member getMemberByEmail(String email) throws Exception {
        return memberDao.getMemberByEmail(email);
    }

    @Override
    public boolean isUserExist(String login, String password) throws Exception {
        return memberDao.isUserExist(login, password);
    }
    
    @Override
	public Member login(String email, String password) throws Exception {
		if (!memberDao.isUserExist(email, password))
			throw new ServiceException(ErrorConstants.ACCCOUNT_NOT_EXISTING);
		else
			return memberDao.getMemberByEmail(email);
	}
}
