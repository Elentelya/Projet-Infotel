//package com.formation.dao.entities;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "city")
//public class City implements java.io.Serializable {
//
//	@Id
//	@GeneratedValue
//	@Column(name = "city_id")
//	private int cityId;
//	private String postalCode;
//	private String name;
//
//	@OneToMany(mappedBy = "addressCity")
//	private List<Address> cityAddresses;
//
//	public City(String name, String postalCode) {
//		super();
//		this.postalCode = postalCode;
//		this.name = name;
//	}
//
//	public City() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public String getPostalCode() {
//		return postalCode;
//	}
//
//	public void setPostalCode(String postalCode) {
//		this.postalCode = postalCode;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public List<Address> getCityAddresses() {
//		return cityAddresses;
//	}
//
//	public void setCityAddresses(List<Address> cityAddresses) {
//		this.cityAddresses = cityAddresses;
//	}
//
//	public int getCityId() {
//		return cityId;
//	}
//
//}