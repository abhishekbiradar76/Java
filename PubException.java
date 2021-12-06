package com.xworkz.pubapp.exception;
//custom checked exception
public class PubException  extends Exception{

	@Override
	public String getMessage() {							// shld to done while  compile time 
		// TODO Auto-generated method stub
		return "Child ...go home and study for exams";
	}
}
