package com.xworkz.pubapp;

import com.xworkz.pubapp.bouncer.Bouncer;
import com.xworkz.pubapp.exception.PubException;

public class PubTester {

	public static void main(String[] args) {
		Bouncer bouncer= new Bouncer();
		try {
		bouncer.check(19);
		}catch(PubException e) {
			
			e.getMessage();
		}
		finally {
			System.out.println("make somme noiice.......");
	}
}
}