package doc.xworkz.splitapp;

import java.util.ArrayList;
import java.util.List;	
import java.util.Scanner;

public class Split {
public static void main(String[] args) {
	List<String>pieces=new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	String input =sc.nextLine().trim();
	System.out.println("input:"+input);
	char ch ='s';
	int startIndex =0;
	int matchIndex=999;
	while((matchIndex=input.indexOf(ch))!=-1) {
		pieces.add(input.substring(startIndex,matchIndex));
		System.out.println(input.substring(startIndex,matchIndex));
		input=input.substring(matchIndex+1);
		System.out.println("Next String :"+input);
		System.out.println();
		
		
	}
	
	System.out.println(input);
	pieces.add(input);
	System.out.println("pieces;"+pieces);
}
}
