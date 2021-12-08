package com.xworkz.crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDAO {
public static String gymEqupment= "";
private	Collection<String> gymEqupmentcollection = new ArrayList<String>();
	
	public boolean save(String gymEt) {
		return gymEqupmentcollection.add(gymEt);
	}
	
	public boolean find (String gymEt) {
		return gymEqupmentcollection.contains(gymEt);
	}
	public boolean findBycaseInsensitive(String gymEt) {
		Iterator<String> itr = gymEqupmentcollection.iterator();
		while (itr.hasNext()) {
			String tempgymEt= itr.next();
			if(tempgymEt.equalsIgnoreCase(gymEt)){
				return true;
			}
			
		}
		return false;
	}
	
	public boolean findBycaseInsensitiveAndTrimmed(String gymEt) {
		Iterator<String> itr = gymEqupmentcollection.iterator();
		 while (itr.hasNext()) {
			 String tempgymEt = itr.next();
			 tempgymEt =tempgymEt.replace(" ", "");
			 gymEqupment = gymEqupment.replace(" ", "");
			 if(tempgymEt.equalsIgnoreCase(tempgymEt)){
				return true; 
			 }
			 
		 }
		 return false;
	}
}
