/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Input_more_then_ten
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner t = new Scanner(System.in);
	int ele;
	int count=0;
	   for (int i=0;i<4 ;i++){
	       ArrayList<Integer> a = new ArrayList<Integer>();
	       ele=t.nextInt();
	       a.add(ele);
	       if(ele>=10){
	          count++;
	        //  System.out.println(count);
	       }
	       else{
	            System.out.println(0);
	       }
	        System.out.println(count);
	   } 
	}
}
