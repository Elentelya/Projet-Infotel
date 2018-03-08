package com.formation.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bookcopy")
public class BookCopy implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookcopy_id")
	private int bookCopyId;
	private String state;
	private boolean available;
	
	@ManyToOne
	private Book bookCopyBook;
	
	@ManyToOne
	private Library bookCopyLibrary;
	
	@OneToMany(mappedBy="borrowCopyBook")
	private List<Borrow> copyBookBorrows;

	public BookCopy(String state, Book bookCopyBook, Library bookCopyLibrary, boolean available) {
		super();
		this.state = state;
		this.bookCopyBook = bookCopyBook;
		this.bookCopyLibrary = bookCopyLibrary;
		this.available = available;
	}

	public BookCopy() {
		// TODO Auto-generated constructor stub
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getBookCopyId() {
		return bookCopyId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Book getBookCopyBook() {
		return bookCopyBook;
	}

	public void setBookCopyBook(Book bookCopyBook) {
		this.bookCopyBook = bookCopyBook;
	}

	public Library getBookCopyLibrary() {
		return bookCopyLibrary;
	}

	public void setBookCopyLibrary(Library bookCopyLibrary) {
		this.bookCopyLibrary = bookCopyLibrary;
	}

	public List<Borrow> getCopyBookBorrows() {
		return copyBookBorrows;
	}

	public void setCopyBookBorrows(List<Borrow> copyBookBorrows) {
		this.copyBookBorrows = copyBookBorrows;
	}

}
