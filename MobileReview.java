package com.xworkz.cloneapp;

public class MobileReview {
public static void main(String[] args) throws CloneNotSupportedException {
	Mobile mobile = new Mobile();
	mobile.setCompany("Apple");
	mobile.setFoldable(false);
	mobile.setName("Iphone13Pro");
	mobile.setRate(160000);
	mobile.setType("SmartPhone");
	Object object =(mobile).clone();
	Mobile mobile2 = (Mobile)object;
	System.out.println(object);
}
}
