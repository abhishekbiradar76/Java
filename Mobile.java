package com.xworkz.cloneapp;

public class Mobile  implements Cloneable{
private String name;
private String company;
private int rate;
private String type;
private boolean foldable;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public boolean isFoldable() {
	return foldable;
}
public void setFoldable(boolean foldable) {
	this.foldable = foldable;
}
@Override
public String toString() {
	return "Mobile [name=" + name + ", company=" + company + ", rate=" + rate + ", type=" + type + ", foldable="
			+ foldable + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
