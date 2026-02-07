package com.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

//Association in hibernate
//OneTwoOne by directional mapping

@Entity
public class Address1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String state;
	
	@OneToOne(mappedBy = "address1")
	Investor investor;
	
	public Address1() {
		super();
	}

	public Address1(String city, String state) {
		super();
		
		this.city = city;
		this.state = state;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Investor getInvestor() {
		return investor;
	}

	public void setInvestor(Investor investor) {
		this.investor = investor;
	}

//	@Override
//	public String toString() {
//		return "Address1 [id=" + id + ", city=" + city + ", state=" + state + ", investor=" + investor + "]";
//	}



	@Override
	public String toString() {
		return "Address1 [id=" + id + ", city=" + city + ", state=" + state + "]";
	}



}
