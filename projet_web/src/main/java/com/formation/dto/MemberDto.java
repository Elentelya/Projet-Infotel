package com.formation.dto;

import java.util.List;

public class MemberDto {

private int memberId;
	
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String phone;
	private boolean admin;
	private boolean active;
	private List<Integer> memberBasketIds;
	private int memberAddressId;
	private List<Integer> memberRegistrationIds;
	
	public MemberDto(String firstname, String lastname, String email, String password, String phone, boolean admin,
			boolean active, List<Integer> memberBasketIds, int memberAddressId, List<Integer> memberRegistrationIds) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.admin = admin;
		this.active = active;
		this.memberBasketIds = memberBasketIds;
		this.memberAddressId = memberAddressId;
		this.memberRegistrationIds = memberRegistrationIds;
	}

	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Integer> getMemberBasketIds() {
		return memberBasketIds;
	}

	public void setMemberBasketIds(List<Integer> memberBasketIds) {
		this.memberBasketIds = memberBasketIds;
	}

	public int getMemberAddressId() {
		return memberAddressId;
	}

	public void setMemberAddressId(int memberAddressId) {
		this.memberAddressId = memberAddressId;
	}

	public List<Integer> getMemberRegistrationIds() {
		return memberRegistrationIds;
	}

	public void setMemberRegistrationIds(List<Integer> memberRegistrationIds) {
		this.memberRegistrationIds = memberRegistrationIds;
	}

	public int getMemberId() {
		return memberId;
	}
	
}
