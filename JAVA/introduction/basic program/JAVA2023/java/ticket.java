/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class ticket
{
	public static void main (String[] args) throws java.lang.Exception
	{System.out.println("enter the nuber of times calculate mony:");
       Scanner t = new Scanner(System.in);
       int n = t.nextInt();
       for (int i=1;i<=n;i++){
           System.out.println("enter the seat:");
           int x =t.nextInt();
           System.out.println("enter the passanger");
           int y =t.nextInt();
           System.out.println("enter the price of ticket");
           int z =t.nextInt();
           int a =x*10;
           System.out.println("total nuber of seat:"+ a);
          // int b =y*z;
           //System.out.println("total amount earn by chef is" +b);
           if (a>=y){
               int b = y*z;
        System.out.println("total amount earn by chef is:" + b);

           } 
           else
           {
               int d = a*z;
            System.out.println("total amount earn by chef is:"+ d);

           }
       } 
	}
}
