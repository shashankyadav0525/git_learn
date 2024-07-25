/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ticket_copy
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// youfor code goes here
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		while(T-->0){
		   int X = sc.nextInt();
		   int Y = sc.nextInt();
		   int Z = sc.nextInt();
		   System.out.println(airline(X,Y,Z));
		   
		}
	}
	
	
	public static int airline(int capacity, int seats, int rupee){
	 int availableseats = 10* capacity;
	 if(availableseats >= seats){
	     return seats*rupee;
	 }
	 return availableseats*rupee;
	 
	 
	 
	}
}
