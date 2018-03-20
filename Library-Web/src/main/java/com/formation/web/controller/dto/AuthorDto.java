package com.formation.web.controller.dto;

public class AuthorDto {

	private int id;
	private String firstname;
	private String lastname;
	private String ShortBio;

	public AuthorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AuthorDto(String firstname, String lastname, String shortBio) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		ShortBio = shortBio;
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

	public String getShortBio() {
		return ShortBio;
	}

	public void setShortBio(String shortBio) {
		ShortBio = shortBio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}