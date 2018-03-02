package entity;

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
	
	@ManyToOne
	private int bookCopyBook;
	
	@ManyToOne
	private int bookCopyLibrary;
	
	@OneToMany(mappedBy="borrowCopyBook")
	private List<Borrow> copyBookBorrows;

	public BookCopy(String state, int bookCopyBook, int bookCopyLibrary) {
		super();
		this.state = state;
		this.bookCopyBook = bookCopyBook;
		this.bookCopyLibrary = bookCopyLibrary;
	}

	public BookCopy() {
		// TODO Auto-generated constructor stub
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

	public int getBookCopyBook() {
		return bookCopyBook;
	}

	public void setBookCopyBook(int bookCopyBook) {
		this.bookCopyBook = bookCopyBook;
	}

	public int getBookCopyLibrary() {
		return bookCopyLibrary;
	}

	public void setBookCopyLibrary(int bookCopyLibrary) {
		this.bookCopyLibrary = bookCopyLibrary;
	}

	public List<Borrow> getCopyBookBorrows() {
		return copyBookBorrows;
	}

	public void setCopyBookBorrows(List<Borrow> copyBookBorrows) {
		this.copyBookBorrows = copyBookBorrows;
	}

}
