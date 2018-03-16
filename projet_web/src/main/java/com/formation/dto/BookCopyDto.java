package com.formation.dto;

import java.util.List;

public class BookCopyDto {

	private int bookCopyId;
	private String state;
	private int bookCopyBookId;
	private int bookCopyLibraryId;
	
	private List<Integer> copyBookBorrowsIds;

	public BookCopyDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookCopyDto(String state, int bookCopyBookId, int bookCopyLibraryId,
			List<Integer> copyBookBorrowsIds) {
		super();
		this.state = state;
		this.bookCopyBookId = bookCopyBookId;
		this.bookCopyLibraryId = bookCopyLibraryId;
		this.copyBookBorrowsIds = copyBookBorrowsIds;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getBookCopyBookId() {
		return bookCopyBookId;
	}

	public void setBookCopyBookId(int bookCopyBookId) {
		this.bookCopyBookId = bookCopyBookId;
	}

	public int getBookCopyLibraryId() {
		return bookCopyLibraryId;
	}

	public void setBookCopyLibraryId(int bookCopyLibraryId) {
		this.bookCopyLibraryId = bookCopyLibraryId;
	}

	public List<Integer> getCopyBookBorrowsIds() {
		return copyBookBorrowsIds;
	}

	public void setCopyBookBorrowsIds(List<Integer> copyBookBorrowsIds) {
		this.copyBookBorrowsIds = copyBookBorrowsIds;
	}

	public int getBookCopyId() {
		return bookCopyId;
	}
	
	
	
}
