package com.formation.dao.implementations;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.entities.Member;
import com.formation.dao.interfaces.IMemberDao;

@Repository
@Transactional
public class MemberDaoImpl implements IMemberDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Member getMemberByEmail(String email) {
        return (Member) sessionFactory.getCurrentSession().createQuery("From Member as m Where m.email= :email").setParameter("email", email).getSingleResult();
    }

    @SuppressWarnings("unchecked")
	@Override
    public boolean isUserExist(String email, String password){
        boolean success = false;
        Member memberChecked = (Member) sessionFactory.getCurrentSession().createQuery("FROM Member m WHERE m.email= :email AND m.password= :password")
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();
        
        if(memberChecked != null){
            success = true;
        }
        return success;
    }
}