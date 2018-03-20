package com.formation.dao.interfaces;

import com.formation.dao.entities.Member;

public interface IMemberDao {

	Member getMemberByEmail(String email);
	boolean isUserExist(String email, String password);
    
}
