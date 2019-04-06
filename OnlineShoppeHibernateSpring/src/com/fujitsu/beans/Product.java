package com.fujitsu.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.stereotype.Component;
/*
 * Author: Vaishnavi G. Malatkar.
 * Company Name: Fujitsu 
 * Creation Date:19/3/2019 (DD/MM/YYYY)
 * Modification Date:2/4/2019 (DD/MM/YYYY)
 * Version:6.0
 * Description: It represent database entity
 * It is java bean class
 * */
//java bean class entity class
@Component
@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {

	@Id
	@GeneratedValue(generator="increment")
	@Column(name="PRODUCT_ID")
	
	private int productId;
	

	@Column(length=30,nullable=false)
	private String name;
	
	@Column(length=30,nullable=false)
	private String brand;
	
	private float price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

	
	
}
