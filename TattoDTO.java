package com.workz.tattotest;

public class TattoDTO {

	private String name;
	private  String length;
	private int price;
	private String shopName;
	public TattoDTO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	@Override
	public String toString() {
		return "TattoDTO [name=" + name + ", length=" + length + ", price=" + price + ", shopName=" + shopName + "]";
	}
	

}
