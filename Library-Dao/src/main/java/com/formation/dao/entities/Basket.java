package com.formation.dao.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "basket")
public class Basket implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "basket_id")
	private int basketId;

	private Date creationDate;
	private Date deliveryDate;

	@ManyToOne
	private Member basketMember;

	@ManyToOne
	private Status basketStatus;

	@OneToMany(mappedBy = "borrowBasket")
	private List<Borrow> basketBorrows;

	public Basket(Date creationDate, Date deliveryDate, Member basketMember, Status status) {
		super();
		this.creationDate = creationDate;
		this.deliveryDate = deliveryDate;
		this.basketMember = basketMember;
		this.basketStatus = status;
	}

	public Basket() {
		// TODO Auto-generated constructor stub
	}

	public Status getStatus() {
		return basketStatus;
	}

	public void setStatus(Status status) {
		this.basketStatus = status;
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