package doc.xworkz.splitapp;

public class Reverce {
	

	    public static void PyramidPattern(int n) 

	    {  

	        for (int i=0; i<n; i++) 

	{ for (int j=n-i; j>1; j--) // a loop for spaces

	            { 

	                System.out.print(  " "  ); //to print space

	            }  

	            for (int j=0; j<=i; j++ ) //for number of columns

	            { 

	                System.out.print("8"); //to print star

	            } 

	            System.out.println(); //end-line after every row

	        } 

	    } 

	    public static void main(String args[]) //driver function, 

	    { 

	        int n = 7; 

	        PyramidPattern(n); 

	    } 

	}

