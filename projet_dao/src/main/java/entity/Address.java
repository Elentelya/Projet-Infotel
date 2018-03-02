package entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address implements java.io.Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "address_id")
	private int addressId;
	private String street;
	private String complement;
	
	@ManyToOne
	private City addressCity;
	
	@OneToOne(mappedBy="editorAddress")
	private Address addressEditor;
	
	@OneToOne(mappedBy="libraryAddress")
	private Address addressLibrary;
	
	@OneToOne(mappedBy="memberAddress")
	private Address addressMember;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Address(String street, String complement, City addressCity, Address addressEditor, Address addressLibrary,
			Address addressMember) {
		super();
		this.street = street;
		this.complement = complement;
		this.addressCity = addressCity;
		this.addressEditor = addressEditor;
		this.addressLibrary = addressLibrary;
		this.addressMember = addressMember;
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


	public City getAddressCity() {
		return addressCity;
	}


	public void setAddressCity(City addressCity) {
		this.addressCity = addressCity;
	}


	public Address getAddressEditor() {
		return addressEditor;
	}


	public void setAddressEditor(Address addressEditor) {
		this.addressEditor = addressEditor;
	}


	public Address getAddressLibrary() {
		return addressLibrary;
	}


	public void setAddressLibrary(Address addressLibrary) {
		this.addressLibrary = addressLibrary;
	}


	public Address getAddressMember() {
		return addressMember;
	}


	public void setAddressMember(Address addressMember) {
		this.addressMember = addressMember;
	}


	public int getAddressId() {
		return addressId;
	}
}
