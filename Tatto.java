package com.workz.tatto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Tatto {
public static void main(String[] args) {
	Collection collection =new ArrayList<>();
	collection.add("baba");
	collection.add("2cm");
	collection.add(25);
	collection.add("charly");
	System.out.println(collection);
	collection.removeAll(collection);
	collection.remove(1);
	//System.out.println(collection.getClass());
	
}

}