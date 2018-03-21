package com.formation.dao.entities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int bookId;
	private String title;
	private String description;
	private double price;
	private Date publicationDate;
	private boolean popularBook;
	private String bookImage;

	// @Column( name = "book_image" )
	// private Blob bookImage;

	@ManyToOne
	private Category bookCategory;

	@ManyToOne
	private Editor bookEditor;

	@OneToMany(mappedBy = "bookCopyBook")
	private List<BookCopy> bookCopys;

	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
	private List<Author> bookAuthors = new ArrayList<Author>(0);

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String description, double price, Date publicationDate, boolean popularBook,
			String bookImage) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.publicationDate = publicationDate;
		this.popularBook = popularBook;
		this.bookImage = bookImage;
	}

	public Book(String title, String description, double price, Date publicationDate, String ImageName,
			boolean popularBook, Category bookCategory, Editor bookEditor, List<Author> bookAuthors)
			throws IOException {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		this.publicationDate = publicationDate;
		this.popularBook = popularBook;
		this.bookCategory = bookCategory;
		this.bookEditor = bookEditor;
		this.bookAuthors = bookAuthors;
		this.setBookImage(ImageName);
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	// public Book(String title, String description, double price, Date
	// publicationDate,
	// Blob bookImage, boolean popularBook, Category bookCategory, Editor
	// bookEditor, List<Author> bookAuthors) throws IOException {
	// super();
	// this.title = title;
	// this.description = description;
	// this.price = price;
	// this.publicationDate = publicationDate;
	// this.popularBook = popularBook;
	// this.bookCategory = bookCategory;
	// this.bookEditor = bookEditor;
	// this.bookAuthors = bookAuthors;
	// this.bookImage = bookImage;
	// }

	// public Blob getBookImage() {
	// return bookImage;
	// }
	//
	//
	// public void setBookImage(Blob bookImage) {
	// this.bookImage = bookImage;
	// }

	public int getBookId() {
		return bookId;
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

	public Category getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(Category bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Editor getBookEditor() {
		return bookEditor;
	}

	public void setBookEditor(Editor bookEditor) {
		this.bookEditor = bookEditor;
	}

	public List<BookCopy> getBookCopys() {
		return bookCopys;
	}

	public void setBookCopys(List<BookCopy> bookCopys) {
		this.bookCopys = bookCopys;
	}

	public List<Author> getBookAuthors() {
		return bookAuthors;
	}

	public void setBookAuthors(List<Author> bookAuthors) {
		this.bookAuthors = bookAuthors;
	}

}