package com.xworkz.cloneapp;

public class HospitalScreen {
public static void main(String[] args) throws CloneNotSupportedException {
	Hospital hospital =new Hospital();
	hospital.setAddress("vijayanagara");
	hospital.setGstNo("	26AADCS0472N1Z4");
	hospital.setName("kalpataru");
	hospital.setOpen(true);
	hospital.setOwner("DontKnow");
	Object object =(hospital).clone();
	Hospital hospital2 =(Hospital)object;
	System.out.println(object);
}
}
