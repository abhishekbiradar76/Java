package com.xworkz.cloneapp;

public class TravelsKing {
public static void main(String[] args) throws CloneNotSupportedException {
	Travels travels = new Travels();
	travels.setCode(2);
	travels.setCommercial(true);
	travels.setGstNo("	37AADCS0472N1Z1");
	travels.setId("fghfghhgj");
	travels.setName("VRL");
Object object =(travels).clone();
Travels travels2 = (Travels)object;
System.out.println(object);
}
}
