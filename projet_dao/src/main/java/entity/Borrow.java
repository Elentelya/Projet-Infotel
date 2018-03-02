package entity;

import java.util.Date;
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
@Table(name="borrow")
public class Borrow implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "borrow_id")
	private int borrowId;
	private Date borrowDate;
	private Date returnDate;
	
	@ManyToOne
	private int borrowCopyBook;
	
	@ManyToOne
	private int borrowBasket;

	public Borrow(Date borrowDate, Date returnDate, int borrowCopyBook, int borrowBasket) {
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


	public int getBorrowCopyBook() {
		return borrowCopyBook;
	}


	public void setBorrowCopyBook(int borrowCopyBook) {
		this.borrowCopyBook = borrowCopyBook;
	}


	public int getBorrowBasket() {
		return borrowBasket;
	}


	public void setBorrowBasket(int borrowBasket) {
		this.borrowBasket = borrowBasket;
	}

}
