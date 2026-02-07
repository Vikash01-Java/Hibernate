package com.learning.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

//Association in hibernate
//OneTwoOne by directional mapping

@Entity
public class Investor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int salary;
	
	@OneToOne(cascade = CascadeType.ALL)   //  Important fix
    @JoinColumn(name = "address1_id")     
	Address1 address1;

	 public Investor() {
		super();
	}


	 public Investor(String name, String gender, int salary, Address1 address1) {
	        this.name = name;
	        this.gender = gender;
	        this.salary = salary;
	        this.address1 = address1;
	    }
	
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Address1 getAddress1() {
		return address1; 
		}
    public void setAddress1(Address1 address1) { 
    	this.address1 = address1;
    	}


//	@Override
//	public String toString() {
//		return "Investor [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", address1="
//				+ address1 + "]";
//	}


	@Override
	public String toString() {
		return "Investor [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	
	
	
	
	

}
