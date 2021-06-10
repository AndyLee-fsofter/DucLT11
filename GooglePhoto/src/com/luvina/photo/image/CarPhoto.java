package com.luvina.photo.image;

public class CarPhoto extends Photo{
	private String name;
	private String brand;
	private String price;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarPhoto [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
