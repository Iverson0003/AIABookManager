package com.chinasoft.entity;

public class Book {
	private int id;
	private String description;
	private String b_name;
	private double  price;
	private String img;
	private int typeId;
	private Type type;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", description=" + description + ", b_name="
				+ b_name + ", price=" + price + ", img=" + img + ", typeId="
				+ typeId + ", type=" + type + "]";
	}
	
}
