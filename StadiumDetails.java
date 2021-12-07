package com.xworkz.cloneapp;

public class StadiumDetails {

	public static void main(String[] args) throws CloneNotSupportedException {
		Stadium stadium = new Stadium();
		stadium.setArea("whiteField");
		stadium.setLocation("Banglore");
		stadium.setName("Kempegouda");
		stadium.setOccupancy(4500);
		stadium.setOpen(true);
		Object object = stadium.clone();
		Stadium stadium1 =(Stadium)object;
		System.out.println(stadium1);
		
	}
}
