package com.formation.dao.implementations;

import com.formation.dao.entities.Member;
import com.formation.dao.interfaces.IMemberDao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
        List<Member> memberChecked = (List<Member>) sessionFactory.getCurrentSession().createQuery("FROM Member m WHERE m.email= :email AND m.password= :password")
                .setParameter("email", email)
                .setParameter("password", password)
                .getSingleResult();
        
        if(memberChecked.size() > 0){
            success = true;
        }
        return success;
    }
}