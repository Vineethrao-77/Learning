package com.learn.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
@Id
	private Long id;
	private String name;
	private String brand;
	private String madein;
	private float price;
	private double rating;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Product(Long id, String name, String brand, String madein, float price, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.madein = madein;
		this.price = price;
		this.rating=rating;
	}
	public Product() {
		super();
	}
	
}

