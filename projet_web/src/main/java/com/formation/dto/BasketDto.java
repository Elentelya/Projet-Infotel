package com.formation.dto;

import java.util.List;

public class BasketDto {
	
	private int basketId;
	private String creationDate;
	private String deliveryDate;
	private int basketMemberId;
	private int basketStatusId;
	private List<Integer> basketBorrowsIds;
	
	public BasketDto(String creationDate, String deliveryDate, int basketMemberId, int basketStatusId,
			List<Integer> basketBorrowsIds) {
		super();
		this.creationDate = creationDate;
		this.deliveryDate = deliveryDate;
		this.basketMemberId = basketMemberId;
		this.basketStatusId = basketStatusId;
		this.basketBorrowsIds = basketBorrowsIds;
	}

	public BasketDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getBasketMemberId() {
		return basketMemberId;
	}
	public void setBasketMemberId(int basketMemberId) {
		this.basketMemberId = basketMemberId;
	}
	public int getBasketStatusId() {
		return basketStatusId;
	}
	public void setBasketStatusId(int basketStatusId) {
		this.basketStatusId = basketStatusId;
	}
	public List<Integer> getBasketBorrowsIds() {
		return basketBorrowsIds;
	}
	public void setBasketBorrowsIds(List<Integer> basketBorrowsIds) {
		this.basketBorrowsIds = basketBorrowsIds;
	}
	public int getBasketId() {
		return basketId;
	}

}
