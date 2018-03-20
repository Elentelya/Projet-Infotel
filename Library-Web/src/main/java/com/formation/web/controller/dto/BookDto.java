package com.formation.web.controller.dto;

import java.util.Date;
import java.util.List;

public class BookDto {

	private String title;
	private String description;
	private double price;
	private Date publicationDate;
	private boolean popularBook;
	private String bookImage;

	private int bookCategoryId;

	private int bookEditorId;

	private List<Integer> bookAuthorsIds;

	public BookDto(String title, String description, double price, Date publicationDate, boolean popularBook,
			String bookImage, int bookCategoryId, int bookEditorId) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.publicationDate = publicationDate;
		this.popularBook = popularBook;
		this.bookImage = bookImage;
		this.bookCategoryId = bookCategoryId;
		this.bookEditorId = bookEditorId;
	}

	public int getBookCategoryId() {
		return bookCategoryId;
	}

	public void setBookCategoryId(int bookCategoryId) {
		this.bookCategoryId = bookCategoryId;
	}

	public int getBookEditorId() {
		return bookEditorId;
	}

	public void setBookEditorId(int bookEditorId) {
		this.bookEditorId = bookEditorId;
	}

	public List<Integer> getBookAuthorsIds() {
		return bookAuthorsIds;
	}

	public void setBookAuthorsIds(List<Integer> bookAuthorsIds) {
		this.bookAuthorsIds = bookAuthorsIds;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public boolean isPopularBook() {
		return popularBook;
	}

	public void setPopularBook(boolean popularBook) {
		this.popularBook = popularBook;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

}