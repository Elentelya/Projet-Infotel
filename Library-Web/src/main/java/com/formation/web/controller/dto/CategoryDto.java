package com.formation.web.controller.dto;

import java.util.List;

public class CategoryDto {

	private int categoryId;
	private String name;
	private String description;
	private List<Integer> categoryBooksIds;

	public CategoryDto(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public CategoryDto() {
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

	public List<Integer> getCategoryBooks() {
		return categoryBooksIds;
	}

	public void setCategoryBooks(List<Integer> categoryBooks) {
		this.categoryBooksIds = categoryBooks;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
}
