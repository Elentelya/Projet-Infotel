package com.formation.dao.interfaces;

import java.util.List;

import com.formation.dao.entities.Member;

public interface IMemberDao {

	List<Member> getListMemberByEmail(String email);
	boolean isUserExist(String email, String password);
	Member getMemberByEmail(String email);
}
