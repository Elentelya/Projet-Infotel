package com.formation.entity;

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
@Table(name="basket")
public class Basket implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "basket_id")
	private int basketId;
	
	private Date creationDate;
	private Date deliveryDate;
	private int status;
	
	@ManyToOne
	private Member basketMember;
	
	@OneToMany(mappedBy="borrowBasket")
	private List<Borrow> basketBorrows;

	public Basket(Date creationDate, Date deliveryDate, Member basketMember, int status) {
		super();
		this.creationDate = creationDate;
		this.deliveryDate = deliveryDate;
		this.basketMember = basketMember;
		this.status = status;
	}


	public Basket() {
		// TODO Auto-generated constructor stub
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public int getBasketId() {
		return basketId;
	}


	public Date getCreationDate() {
		return creationDate;
	}


	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public Date getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public Member getBasketMember() {
		return basketMember;
	}


	public void setBasketMember(Member basketMember) {
		this.basketMember = basketMember;
	}


	public List<Borrow> getBasketBorrows() {
		return basketBorrows;
	}


	public void setBasketBorrows(List<Borrow> basketBorrows) {
		this.basketBorrows = basketBorrows;
	}

}
