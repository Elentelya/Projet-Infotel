package com.formation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="registration")
public class Registration implements java.io.Serializable {

	@EmbeddedId
	@Column(name = "registration_id")
	private RegistrationId registrationId;
	
    private Date registrationDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("library")
    private Library registrationLibrary;

    // bi-directional many-to-one association to FournisseurDepartement
    @ManyToOne(fetch = FetchType.LAZY)
	@MapsId("member")
    private Member registrationMember;
    
	

	public Registration(Date registrationDate, Library registrationLibrary,
			Member registrationMember) {
		super();
		this.registrationId = new RegistrationId(registrationLibrary.getLibraryId(), registrationMember.getMemberId());
		this.registrationDate = registrationDate;
		this.registrationLibrary = registrationLibrary;
		this.registrationMember = registrationMember;
	}



	public RegistrationId getRegistrationId() {
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
