package com.xworkz.cloneapp;

public class InstituteOverview {
public static void main(String[] args) throws CloneNotSupportedException {
	Institute institute = new Institute();
	institute.setAddress("rajajinagara");
	institute.setGstNo("29AAFCC9980M1ZR");
	institute.setId("hgjnbjgvfy");
	institute.setName("udemy");
	institute.setOpen(true);
	Object object = institute.clone();
	Institute institute2= (Institute)object;
	System.out.println(institute2);
	
}
}
