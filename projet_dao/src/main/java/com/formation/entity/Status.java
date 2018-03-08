package com.formation.entity;

import java.nio.MappedByteBuffer;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "status_id")
	private int statusId;
	private String name;
	
	@OneToMany(mappedBy="basketStatus")
	private List<Basket> statusBaskets;
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Status(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Basket> getStatusBaskets() {
		return statusBaskets;
	}

	public void setStatusBaskets(List<Basket> statusBaskets) {
		this.statusBaskets = statusBaskets;
	}

	public int getStatusId() {
		return statusId;
	}

	
	
}
