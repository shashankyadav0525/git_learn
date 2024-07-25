
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class kgsec_fuel
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner t =new Scanner(System.in);
int n= t.nextInt();
for (int i=1; i<=n; i++){
    int x=t.nextInt();
    x=x*5;
    int y=t.nextInt();
    if(x>=y){
        System.out.println("YES");

    }
    else{
        System.out.println("NO");

    }
} 
	}
}
