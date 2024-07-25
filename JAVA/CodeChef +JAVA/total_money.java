
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class total_money 
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner t=new Scanner(System.in);
int q=t.nextInt();
while(q-->0){
    int n=t.nextInt();
    int m=t.nextInt();
    int x=t.nextInt();
    int ans=2*(n+m)*x;
    System.out.println(ans);
}
}
}
