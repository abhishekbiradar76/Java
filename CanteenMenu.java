package com.xworkz.cloneapp;

public class CanteenMenu {

	public static void main(String[] args) throws CloneNotSupportedException {
	Canteen canteen =new Canteen();
	canteen.setFood("Dosa");
	canteen.setGoodTaste(true);
	canteen.setLocation("IndiraNagara");
	canteen.setRate(60);
	Object  object = (canteen).clone();
	Canteen canteen2= (Canteen)object;
	System.out.println(object);
	}
}
