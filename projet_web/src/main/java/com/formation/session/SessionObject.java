package com.formation.session;

import com.formation.entity.Member;

public class SessionObject {

	private Member member;
	
	@SuppressWarnings("unused")
	private Member getMember() {
		return member;
	}
	
	@SuppressWarnings("unused")
	private void setMember(Member member) {
		this.member = member;
	}
	
	public boolean isConnected() {
		return member != null;
	}
}
