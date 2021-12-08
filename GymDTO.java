package com.xworkz.crud;

public class GymDTO {

	public static void main(String[] args) {
		GymDAO dao =new GymDAO();
		dao.save("dembel ");
		dao.save("Thread wheel");
		dao.save("skipper");
		boolean found =  dao.find("dembel ");
		System.out.println(found);
		found= dao.findBycaseInsensitive("Dembel");
		System.out.println(found);
		found=dao.findBycaseInsensitiveAndTrimmed("de mel");
		System.out.println(found);
		
		
	}
}
 