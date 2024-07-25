/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class q03
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner t=new Scanner(System.in);
         System.out.println("enter the times of test perform:");
         int n=t.nextInt();
         System.out.println("enter the element in array:");
         for (int i=0; i<n; i++){
           int[] a=new int[3];
           a[0]=t.nextInt();
           a[1]=t.nextInt();
           a[2]=t.nextInt();
           if((a[0]<=a[1] || a[1]<a[2]) && (a[0]<=a[2])){
             System.out.println("no");
           }
           else{
             System.out.println("yes");
           }
	}
	}
}
