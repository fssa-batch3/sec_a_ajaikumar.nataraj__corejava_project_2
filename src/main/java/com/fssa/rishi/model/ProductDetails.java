package com.fssa.rishi.model;

import java.time.LocalDate;

public class ProductDetails {

	private long id;
	private String name;
	private int price;
	private int quantity; 
	private String description;
	private String url;
	private String address; 
	private String type;
	private String city;
	private long userId;
	private int pincode; 
	private LocalDate uploadDate;
	private boolean isDeleted;

	

	public ProductDetails(long id, String name, int price, int quantity, String description, String url,
			String address, String type, String city, long userId, int pincode, LocalDate dob) {
		this.id = id;
		this.name = name; 
		this.price = price;
		this.quantity = quantity;
		this.address = address;
		this.description = description;
		this.url = url;
		this.type = type;
		this.city = city;
		this.userId = userId;
		this.pincode = pincode;
		this.uploadDate = dob;
	}

	public ProductDetails(long id, String name, int price, int quantity, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;


	}



	public ProductDetails(long id) {
		this.id = id;
	}

	public ProductDetails() {
		// TODO Auto-generated constructor stub
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setUploadDate(LocalDate date) {
		this.uploadDate = date;
	}
	
	public void setIsDeleted(boolean is_deleted) {
		this.isDeleted = is_deleted;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getDescription() {
		return description;
	}

	public String getUrl() {
		return url;
	}

	public String getType() {
		return type;
	}

	public long getUserId() {
		return userId;
	}

	public int getPincode() {
		return pincode;
	}

	public LocalDate getUploadDate() {
		return uploadDate; 
	}
	
	public boolean getIsDeleted() {
		return isDeleted; 
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", description=" + description + ", url=" + url + ", address=" + address + ", type=" + type
				+ ", city=" + city + ", userId=" + userId + ", pincode=" + pincode + ", uploadDate=" + uploadDate
				+ "]";
	}

}
