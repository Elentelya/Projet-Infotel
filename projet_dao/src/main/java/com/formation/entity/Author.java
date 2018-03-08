package com.formation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="author")
public class Author implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private int authorId;
	private String firstname;
	private String lastname;
	private String shortBio;
	
	@ManyToMany(mappedBy = "bookAuthors")
    private List<Book> authorBooks = new ArrayList<Book>();

	public Author(String firstname, String lastname, String shortBio) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.shortBio = shortBio;
	}

	public Author() {
		// TODO Auto-generated constructor stub
	}


	public List<Book> getAuthorBooks() {
		return authorBooks;
	}


	public void setAuthorBooks(List<Book> authorBooks) {
		this.authorBooks = authorBooks;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getShortBio() {
		return shortBio;
	}


	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}


	public int getAuthorId() {
		return authorId;
	}

}
