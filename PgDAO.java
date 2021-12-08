package com.xworkz.crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class PgDAO {

	public static String pgDetail="";
	Collection<String> pgDetailcollection = new ArrayList<String>();
	public boolean save ( String  pgDtl) {
	return pgDetailcollection.add(pgDtl);	
	}
	public boolean find ( String pgDtl) {
		return pgDetailcollection.contains(pgDtl);
		
	}
	public boolean findBycaseInSensitive(String pgDtl ) {
		Iterator<String> itr = pgDetailcollection.iterator();
		while (itr.hasNext()) {
			String temppgDtl = itr.next();
			if(temppgDtl.equalsIgnoreCase(pgDtl)) {
				return true;
				
			}
		}
		return false;
	}
	public boolean findBycaseSensitiveAndTrimmed(String pgDtl) {
		Iterator<String> itr = pgDetailcollection.iterator();
		while(itr.hasNext()) {
			String temppgDtl = itr.next();
			temppgDtl = temppgDtl.replace(" ", "");
			pgDtl =pgDtl.replace(" ", "");
			if(temppgDtl.equalsIgnoreCase(pgDtl)){
				return true;
			}
			
		}
		return false;
	}
}
