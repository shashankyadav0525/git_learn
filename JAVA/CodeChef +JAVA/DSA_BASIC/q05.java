/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class q05
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner n=new Scanner(System.in);
       int t=n.nextInt();
       for (int i=0; i<t; i++){
         int x=n.nextInt();
         if(x%25==0){
            System.out.println(x/25);
         }
         else{
         x=x/25;
         System.out.println(x+1);

        }

       } 


	}
}
