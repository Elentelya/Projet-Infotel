package com.formation.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.formation.entity.Member;

@Repository
@Transactional
public class DaoMemberImpl implements IDaoMember {

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void insert(Member member) {
        sessionFactory.getCurrentSession().save(member);
    }

    @Override
    public Member findById(int memberId) {
        return sessionFactory.getCurrentSession().find(Member.class, memberId);
    }
    
    @Override
    public List<Member> findByEmail(String email) {
        @SuppressWarnings("unchecked")
        List<Member> listeMembres = sessionFactory.getCurrentSession().createQuery("FROM Member m WHERE m.email = :email").setParameter("email", email).list();
        return listeMembres;  
    }

    @Override
    public List<Member> findAll() {
        @SuppressWarnings("unchecked")
        List<Member> listeMembres = sessionFactory.getCurrentSession().createQuery("FROM Member member").list(); 
        return listeMembres;
    }

    @Override
    public void update(Member member) {
        sessionFactory.getCurrentSession().update(member);
    }

    @Override
    public void delete(int memberId) {
        sessionFactory.getCurrentSession().delete(memberId);
    }
    
    @Override
    public List<Member> passwordRecovery(String email) { //SELECT password 
    	@SuppressWarnings("unchecked")
    	List<Member> listeMembres = sessionFactory.getCurrentSession().createQuery("FROM Member m WHERE m.email = :email").setParameter("email",email).list();
    	return listeMembres;
    }
}