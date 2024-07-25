/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class q01
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner t = new Scanner(System.in);
          System.out.println("entr the num of times u run");
          int n=t.nextInt();
         System.out.println("entr the size of element");
         int m=t.nextInt();
         int ans=0;
         int[] a=new int[n];
         for (int i=0; i<n; i++){
           for(int j=0; j<m; j++){
             a[j]=t.nextInt();
             if(a[j]>=1000){
                ans++;
             }

            }
            System.out.println("total larger no is:" +ans);

          } 
          
	}
}
