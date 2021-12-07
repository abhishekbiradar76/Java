package com.xworkz.cloneapp;

public class LaptopTester {
public static void main(String[] args) throws CloneNotSupportedException {
	Laptop laptop = new Laptop();
	laptop.setName("LENOVO");
	laptop.setModelNo("81WB");
	laptop.setAvailable(true);
	laptop.setPrice(45000);
	laptop.setSpecifictions("8gbRAM i5 processor ");
	
	Object object= laptop.clone();
	Laptop laptop1= (Laptop)object;
	
	System.out.println(laptop1);
}
	
}
