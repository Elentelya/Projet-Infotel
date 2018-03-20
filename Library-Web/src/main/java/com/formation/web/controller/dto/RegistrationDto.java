package com.formation.web.controller.dto;

public class RegistrationDto {

	private int registrationId;
	private String registrationDate;
	private int registrationLibraryId;
	private int registrationMemberId;

	public RegistrationDto(String registrationDate, int registrationLibraryId, int registrationMemberId) {
		super();
		this.registrationDate = registrationDate;
		this.registrationLibraryId = registrationLibraryId;
		this.registrationMemberId = registrationMemberId;
	}

	public RegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getRegistrationLibraryId() {
		return registrationLibraryId;
	}

	public void setRegistrationLibraryId(int registrationLibraryId) {
		this.registrationLibraryId = registrationLibraryId;
	}

	public int getRegistrationMemberId() {
		return registrationMemberId;
	}

	public void setRegistrationMemberId(int registrationMemberId) {
		this.registrationMemberId = registrationMemberId;
	}

	public int getRegistrationId() {
		return registrationId;
	}

}
