package com.xworkz.cloneapp;

public class Institute implements Cloneable {
private String name;
private String id;
private String gstNo;
private boolean isOpen;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getGstNo() {
	return gstNo;
}
public void setGstNo(String gstNo) {
	this.gstNo = gstNo;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "instituteapp [name=" + name + ", id=" + id + ", gstNo=" + gstNo + ", isOpen=" + isOpen + ", address="
			+ address + "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
