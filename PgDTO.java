package com.xworkz.crud;

public class PgDTO {

	public static void main(String[] args) {
		PgDAO dao = new PgDAO();
		dao.save("SRI GURU PG");
		dao.save("5000 rent");
		boolean found = dao.find("sri guru pg");
		System.out.println(found);
		found=  dao.findBycaseInSensitive("sriguru pg");
		System.out.println(found);
		found= dao.findBycaseSensitiveAndTrimmed("sri gurupg");
		System.out.println(found);
	}
}
