package com.formation.dao.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "editor")
public class Editor implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "editor_id")
	private int editorId;
	private String name, address;

//	@OneToOne
//	@JoinColumn(name = "address", referencedColumnName = "address_id")
//	private Address editorAddress;

	@OneToMany(mappedBy = "bookEditor")
	private List<Book> editorBooks;

	public Editor(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Editor() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getEditorBooks() {
		return editorBooks;
	}

	public void setEditorBooks(List<Book> editorBooks) {
		this.editorBooks = editorBooks;
	}

	public int getEditorId() {
		return editorId;
	}

}