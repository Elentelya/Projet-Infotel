package com.formation.dto;

public class AddressDto {

	private int addressId;
	private String street;
	private String complement;
	private int addressCityId;
	private int addressEditorId;
	private int addressLibraryId;
	private int addressMemberId;
	
	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddressDto(String street, String complement, int addressCityId, int addressEditorId, int addressLibraryId,
			int addressMemberId) {
		super();
		this.street = street;
		this.complement = complement;
		this.addressCityId = addressCityId;
		this.addressEditorId = addressEditorId;
		this.addressLibraryId = addressLibraryId;
		this.addressMemberId = addressMemberId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public int getAddressCityId() {
		return addressCityId;
	}

	public void setAddressCityId(int addressCityId) {
		this.addressCityId = addressCityId;
	}

	public int getAddressEditorId() {
		return addressEditorId;
	}

	public void setAddressEditorId(int addressEditorId) {
		this.addressEditorId = addressEditorId;
	}

	public int getAddressLibraryId() {
		return addressLibraryId;
	}

	public void setAddressLibraryId(int addressLibraryId) {
		this.addressLibraryId = addressLibraryId;
	}

	public int getAddressMemberId() {
		return addressMemberId;
	}

	public void setAddressMemberId(int addressMemberId) {
		this.addressMemberId = addressMemberId;
	}

	public int getAddressId() {
		return addressId;
	}
	
	
	
}
