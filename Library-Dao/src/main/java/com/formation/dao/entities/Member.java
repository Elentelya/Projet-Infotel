package com.formation.dao.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private int memberId;

	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String phone;
	private String address;
	private boolean admin;
	private boolean active;

	@OneToMany(mappedBy = "basketMember")
	private List<Basket> memberBaskets;

//	@OneToOne
//	@JoinColumn(name = "address", referencedColumnName = "address_id")
//	private Address memberAddress;

	@OneToMany(mappedBy = "registrationMember")
	private List<Registration> memberRegistrations;

	public Member(String firstname, String lastname, String email, String password, String phone, String address, boolean admin,
			boolean active) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.admin = admin;
		this.active = active;
	}

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public int getMemberId() {
		return memberId;
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

	public List<Basket> getMemberBaskets() {
		return memberBaskets;
	}

	public void setMemberBaskets(List<Basket> memberBaskets) {
		this.memberBaskets = memberBaskets;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Registration> getMemberRegistrations() {
		return memberRegistrations;
	}

	public void setMemberRegistrations(List<Registration> memberRegistrations) {
		this.memberRegistrations = memberRegistrations;
	}

}