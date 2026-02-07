package com.learning.entity;
import jakarta.persistence.Column;
//ANNOTATION
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "emp")
public class Car {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name ="empName")
private String name;
private String color;
private int price;
public Car() {
	super();
}
public Car(String name, String color,  int price) {
	super();
	this.name = name;
	this.color = color;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getId() {
	return id;
}
public void setId(int id ) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Car [name=" + name + ", color=" + color + ", id=" + id + ", price=" + price + "]";
}



}
