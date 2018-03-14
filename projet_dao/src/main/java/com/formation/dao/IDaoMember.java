package com.formation.dao;

import java.util.List;

import com.formation.entity.Member;

public interface IDaoMember {

    void insert(Member member);

    Member findById(int memberId);
    List<Member> findByEmail(String email);
    List<Member> findAll();
    
    void update(Member member);

    void delete(int memberId);
    
    List<Member> passwordRecovery(String email);
    
}