package com.formation.dao.entities;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "registration")
public class Registration implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "registration_id")
	private int registrationId;

	private Date registrationDate;

	@ManyToOne
	private Library registrationLibrary;

	@ManyToOne
	private Member registrationMember;

	public Registration(Date registrationDate, Library registrationLibrary, Member registrationMember) {
		super();
		this.registrationDate = registrationDate;
		this.registrationLibrary = registrationLibrary;
		this.registrationMember = registrationMember;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Library getRegistrationLibrary() {
		return registrationLibrary;
	}

	public void setRegistrationLibrary(Library registrationLibrary) {
		this.registrationLibrary = registrationLibrary;
	}

	public Member getRegistrationMember() {
		return registrationMember;
	}

	public void setRegistrationMember(Member registrationMember) {
		this.registrationMember = registrationMember;
	}

	public Registration() {
		// TODO Auto-generated constructor stub
	}

}