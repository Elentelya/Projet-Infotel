package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="library")
public class Library implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "library_id")
	private int libraryId;
	
	private String name;
	
	@OneToOne
	@JoinColumn(name = "address", referencedColumnName = "address_id")
	private Address libraryAddress;
	
	@OneToMany(mappedBy="bookCopyLibrary")
	private List<BookCopy> libraryBookCopys;
	
	@OneToMany(mappedBy="registrationLibrary")
	private List<Registration> libraryRegistrations;



	public Library(String name, Address libraryAddress) {
		super();
		this.name = name;
		this.libraryAddress = libraryAddress;
	}

	public Library() {
		// TODO Auto-generated constructor stub
	}

	public int getLibraryId() {
		return libraryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getLibraryAddress() {
		return libraryAddress;
	}

	public void setLibraryAddress(Address libraryAddress) {
		this.libraryAddress = libraryAddress;
	}

	public List<BookCopy> getLibraryBookCopy() {
		return libraryBookCopys;
	}

	public void setLibraryBookCopy(List<BookCopy> libraryBookCopy) {
		this.libraryBookCopys = libraryBookCopy;
	}

	public List<Registration> getLibraryRegistrations() {
		return libraryRegistrations;
	}

	public void setLibraryRegistrations(List<Registration> libraryRegistrations) {
		this.libraryRegistrations = libraryRegistrations;
	}

}
