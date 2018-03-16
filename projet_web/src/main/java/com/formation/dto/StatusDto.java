package com.formation.dto;

public class StatusDto {

	private int statusId;
	private String name;
	
	public StatusDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StatusDto(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatusId() {
		return statusId;
	}
	
}
