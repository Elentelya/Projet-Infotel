package com.formation.service.interfaces;

import java.util.List;

import com.formation.dao.entities.Member;

public interface IMemberService {

	// IGenericDao
	void insert(Member member) throws Exception;
	Member getById(int memberId) throws Exception;
	List<Member> getAll() throws Exception;
	void update(Member member) throws Exception;
	void delete(Member member) throws Exception;
	
	// IMemberDao
	Member getMemberByEmail(String email) throws Exception;
	boolean isUserExist(String email, String password) throws Exception;
	
	// Login Test
	Member login(String email,String password) throws Exception;

}
