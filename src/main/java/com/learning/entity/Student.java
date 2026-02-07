package com.learning.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


//@NamedQuery(name = "findStuByName",     query = "from Student s where s.name = :name")
@NamedQuery(name = "findStu",     query = "from Student where id > 4")



@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String name;
	private String gender;
	@Column(name = "salary")
    private int salary;
	public Student() {
		super();
	}
	
	public Student(String name, String gender, int salary) {
		super();
//		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

	
	
	
}
