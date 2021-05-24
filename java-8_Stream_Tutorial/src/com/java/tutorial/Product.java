package com.java.tutorial;

public class Product {
	int id;
	String name;
	 Double price;
	/**
	 * @return the id
	 */
	
	public int getId() {
		return id;
	}
	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Product(int id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public   Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	
}
