
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class three_condition 
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner t=new Scanner(System.in);
int q=t.nextInt();
while(q-->0){
    int n=t.nextInt();
    if(n<4){
        System.out.println("MILD");
    }
    else if((n>=4)&&(7>n)){
        System.out.println("MEDIUM");
    }
    else if(7<n){
        System.out.println("HOT");
    }
	}
}
}

