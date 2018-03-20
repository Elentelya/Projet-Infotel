package com.formation.dao.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private int categoryId;
	private String name;
	private String description;

	@OneToMany(mappedBy = "bookCategory")
	private List<Book> categoryBooks;

	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Book> getCategoryBooks() {
		return categoryBooks;
	}

	public void setCategoryBooks(List<Book> categoryBooks) {
		this.categoryBooks = categoryBooks;
	}

	public int getCategoryId() {
		return categoryId;
	}

}