package com.xworkz.cloneapp;

public class Travels implements Cloneable {
private String name;
private String id;
private int code;
private  String gstNo;
private boolean commercial;
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
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getGstNo() {
	return gstNo;
}
public void setGstNo(String gstNo) {
	this.gstNo = gstNo;
}
public boolean isCommercial() {
	return commercial;
}
public void setCommercial(boolean commercial) {
	this.commercial = commercial;
}
@Override
public String toString() {
	return "Travels [name=" + name + ", id=" + id + ", code=" + code + ", gstNo=" + gstNo + ", commercial=" + commercial
			+ "]";
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
