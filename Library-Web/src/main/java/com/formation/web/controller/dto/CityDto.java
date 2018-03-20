package com.formation.web.controller.dto;

import java.util.List;

public class CityDto {

	private int cityId;
	private String postalCode;
	private String name;
	private List<Integer> cityAddresses;

	public CityDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityDto(String postalCode, String name, List<Integer> cityAddresses) {
		super();
		this.postalCode = postalCode;
		this.name = name;
		this.cityAddresses = cityAddresses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getCityAddresses() {
		return cityAddresses;
	}

	public void setCityAddresses(List<Integer> cityAddresses) {
		this.cityAddresses = cityAddresses;
	}

	public int getCityId() {
		return cityId;
	}

}
