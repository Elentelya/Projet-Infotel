package entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String description;
	private double price;
	private Date PublicationDate;
	private String imagePath;
	private boolean popularBook;

	public Book() {

	}

	public Book(String title, String description, double price, Date publicationDate, String imagePath,
			boolean popularBook) {
		super();
		this.title = title;
		this.description = description;
		this.price = price;
		PublicationDate = publicationDate;
		this.imagePath = imagePath;
		this.popularBook = popularBook;
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
		return PublicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		PublicationDate = publicationDate;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public boolean isPopularBook() {
		return popularBook;
	}

	public void setPopularBook(boolean popularBook) {
		this.popularBook = popularBook;
	}

	public int getId() {
		return id;
	}

}
