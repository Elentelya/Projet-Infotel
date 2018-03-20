package com.formation.dao.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "library")
public class Library implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "library_id")
	private int libraryId;

	private String name;
	private String numero;

	@OneToOne
	@JoinColumn(name = "address", referencedColumnName = "address_id")
	private Address libraryAddress;

	@OneToMany(mappedBy = "bookCopyLibrary")
	private List<BookCopy> libraryBookCopys;

	@OneToMany(mappedBy = "registrationLibrary")
	private List<Registration> libraryRegistrations;

	public Library(String name, String numero) {
		super();
		this.name = name;
		this.setNumero(numero);
	}

	public Library() {

	}

	public int getLibraryId() {
		return libraryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(Address libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	public List<BookCopy> getLibraryBookCopy() {
		return libraryBookCopys;
	}

	public void setLibraryBookCopy(List<BookCopy> libraryBookCopy) {
		this.libraryBookCopys = libraryBookCopy;
	}

	public List<Registration> getLibraryRegistrations() {
		return libraryRegistrations;
	}

	public void setLibraryRegistrations(List<Registration> libraryRegistrations) {
		this.libraryRegistrations = libraryRegistrations;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}