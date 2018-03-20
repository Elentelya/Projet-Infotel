package com.formation.web.controller.dto;

import java.util.List;

public class LibraryDto {

	private int libraryId;

	private String name;
	private String numero;
	private int libraryAddressId;
	private List<Integer> libraryBookCopyIds;
	private List<Integer> libraryRegistrationIds;

	public LibraryDto(String name, String numero, int libraryAddressId, List<Integer> libraryBookCopyIds,
			List<Integer> libraryRegistrationIds) {
		super();
		this.name = name;
		this.numero = numero;
		this.libraryAddressId = libraryAddressId;
		this.libraryBookCopyIds = libraryBookCopyIds;
		this.libraryRegistrationIds = libraryRegistrationIds;
	}

	public LibraryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getLibraryAddressId() {
		return libraryAddressId;
	}

	public void setLibraryAddressId(int libraryAddressId) {
		this.libraryAddressId = libraryAddressId;
	}

	public List<Integer> getLibraryBookCopyIds() {
		return libraryBookCopyIds;
	}

	public void setLibraryBookCopyIds(List<Integer> libraryBookCopyIds) {
		this.libraryBookCopyIds = libraryBookCopyIds;
	}

	public List<Integer> getLibraryRegistrationIds() {
		return libraryRegistrationIds;
	}

	public void setLibraryRegistrationIds(List<Integer> libraryRegistrationIds) {
		this.libraryRegistrationIds = libraryRegistrationIds;
	}

	public int getLibraryId() {
		return libraryId;
	}

}	