package com.formation.web.controller.dto;

public class BorrowDto {

	private int borrowId;
	private int borrowDate;
	private int returnDate;
	private int borrowCopyBookId;
	private int borrowBasketId;

	public BorrowDto(int borrowDate, int returnDate, int borrowCopyBookId, int borrowBasketId) {
		super();
		this.borrowDate = borrowDate;
		this.returnDate = returnDate;
		this.borrowCopyBookId = borrowCopyBookId;
		this.borrowBasketId = borrowBasketId;
	}

	public BorrowDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBorrowDate() {
		return borrowDate;
	}

	public void setBorrowDate(int borrowDate) {
		this.borrowDate = borrowDate;
	}

	public int getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(int returnDate) {
		this.returnDate = returnDate;
	}

	public int getBorrowCopyBookId() {
		return borrowCopyBookId;
	}

	public void setBorrowCopyBookId(int borrowCopyBookId) {
		this.borrowCopyBookId = borrowCopyBookId;
	}

	public int getBorrowBasketId() {
		return borrowBasketId;
	}

	public void setBorrowBasketId(int borrowBasketId) {
		this.borrowBasketId = borrowBasketId;
	}

	public int getBorrowId() {
		return borrowId;
	}
}
