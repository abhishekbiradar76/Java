package com.xworkz.connector;

public class Trip {
	public static void main(String[] args) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Java DataBase Connectivity is Created");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
