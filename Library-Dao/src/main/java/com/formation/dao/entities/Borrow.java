package com.formation.dao.entities;

import java.lang.reflect.Member;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "borrow")
public class Borrow implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "borrow_id")
	private int borrowId;
	private Date borrowDate;
	private Date returnDate;

	@ManyToOne
	private BookCopy borrowCopyBook;

	@ManyToOne
	private Basket borrowBasket;

	public Borrow(Date borrowDate, Date returnDate, BookCopy borrowCopyBook, Basket borrowBasket) {
		super();
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.borrowCopyBook = borrowCopyBook;
		this.borrowBasket = borrowBasket;
	}

	public Borrow() {
		// TODO Auto-generated constructor stub
	}

	public int getBorrowId() {
		return borrowId;
	}

	public Date getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public BookCopy getBorrowCopyBook() {
		return borrowCopyBook;
	}

	public void setBorrowCopyBook(BookCopy borrowCopyBook) {
		this.borrowCopyBook = borrowCopyBook;
	}

	public Basket getBorrowBasket() {
		return borrowBasket;
	}

	public void setBorrowBasket(Basket borrowBasket) {
		this.borrowBasket = borrowBasket;
	}

}