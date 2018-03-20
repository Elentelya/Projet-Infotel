//package com.formation.dao.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="address")
//public class Address implements java.io.Serializable {
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "address_id")
//	private int addressId;
//	private String street;
//	private String complement;
//	
//	@ManyToOne
//	private City addressCity;
//	
//	@OneToOne(mappedBy="editorAddress")
//	private Editor addressEditor;
//	
//	@OneToOne(mappedBy="libraryAddress")
//	private Library addressLibrary;
//	
//	@OneToOne(mappedBy="memberAddress")
//	private Member addressMember;
//
//	public Address() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//
//	public Address(String street, String complement, City addressCity, Member addressMember) {
//		super();
//		this.street = street;
//		this.complement = complement;
//		this.addressCity = addressCity;
//		this.addressMember = addressMember;
//	}
//
//	public Address(String street, String complement, City addressCity, Editor addressEditor) {
//		super();
//		this.street = street;
//		this.complement = complement;
//		this.addressCity = addressCity;
//		this.addressEditor = addressEditor;
//	}
//
//	public Address(String street, String complement, City addressCity, Library addressLibrary) {
//		super();
//		this.street = street;
//		this.complement = complement;
//		this.addressCity = addressCity;
//		this.addressLibrary = addressLibrary;
//	}
//
//
//	public String getStreet() {
//		return street;
//	}
//
//	public void setStreet(String street) {
//		this.street = street;
//	}
//
//	public String getComplement() {
//		return complement;
//	}
//
//	public void setComplement(String complement) {
//		this.complement = complement;
//	}
//
//
//	public City getAddressCity() {
//		return addressCity;
//	}
//
//
//	public void setAddressCity(City addressCity) {
//		this.addressCity = addressCity;
//	}
//
//
//	public Editor getAddressEditor() {
//		return addressEditor;
//	}
//
//
//	public void setAddressEditor(Editor addressEditor) {
//		this.addressEditor = addressEditor;
//	}
//
//
//	public Library getAddressLibrary() {
//		return addressLibrary;
//	}
//
//
//	public void setAddressLibrary(Library addressLibrary) {
//		this.addressLibrary = addressLibrary;
//	}
//
//
//	public Member getAddressMember() {
//		return addressMember;
//	}
//
//
//	public void setAddressMember(Member addressMember) {
//		this.addressMember = addressMember;
//	}
//
//
//	public int getAddressId() {
//		return addressId;
//	}
//}