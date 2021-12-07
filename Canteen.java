package com.xworkz.cloneapp;

public class Canteen implements Cloneable {

	private String name;
	private String food;
	private String location;
	private int rate;
	private boolean goodTaste;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public boolean isGoodTaste() {
		return goodTaste;
	}
	public void setGoodTaste(boolean goodTaste) {
		this.goodTaste = goodTaste;
	}
	@Override
	public String toString() {
		return "Canteen [name=" + name + ", food=" + food + ", location=" + location + ", rate=" + rate + ", goodTaste="
				+ goodTaste + "]";
	}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}	
}
