package com.formation.service;

import java.util.List;

import com.formation.entity.Member;

public interface IServiceMember {

    void insert(Member member);

    Member findById(int memberId);
    boolean findByEmail(String email);
    List<Member> findAll();

    void update(Member author);

    void delete(int memberId);
    
    boolean emailIsCorrect(String email);
    
    Member passwordRecovery(String email);
}