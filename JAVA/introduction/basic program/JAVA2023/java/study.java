 //package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main" only if the class is public. */
class study
{
	public static void main (String[] args) throws java.lang.Exception
	{        System.out.println("check for  each books:");

       Scanner t = new Scanner(System.in);
       int a = t.nextInt();
       while(a-->0){
        System.out.println("enter the page of book:");
           int X = t.nextInt();
           System.out.println("enter the regular page study:");

           int Y = t.nextInt();
           System.out.println("enter the number of day:");

           int Z = t.nextInt();
           int A = Y*Z;
           System.out.println("total pages study is :" + A);
           
           if(A==X){
            System.out.println("total pages are completely studies:");
           }
           else if(A>X){
            System.out.println("total pages studyes end:" );

           }
           else{
            int B = X-A;
            System.out.println("required pages are left to study:" + B);
           }
         
       
	    }
	}
}
