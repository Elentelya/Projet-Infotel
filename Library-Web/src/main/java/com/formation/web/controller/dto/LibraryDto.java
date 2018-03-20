package com.formation.web.controller.dto;

import java.util.List;

public class LibraryDto {

	private int libraryId;

	private String name;
	private String numero;
	private String libraryAddress;
	private List<Integer> libraryBookCopyIds;
	private List<Integer> libraryRegistrationIds;

	public LibraryDto(String name, String numero, String libraryAddress, List<Integer> libraryBookCopyIds,
			List<Integer> libraryRegistrationIds) {
		super();
		this.name = name;
		this.numero = numero;
		this.libraryAddress = libraryAddress;
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

	public String getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
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