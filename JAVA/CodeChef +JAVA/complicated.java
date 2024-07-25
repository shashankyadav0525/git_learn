
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class complicated 
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner t=new Scanner(System.in);
    int n=t.nextInt();
    while(n-->0){
        int x=t.nextInt();
        int y=t.nextInt();
        int z=t.nextInt();
        if((x<=y)&&(y>z)){
            if(x<=z){
            System.out.println("YES");
        
        }
        else{
            System.out.println("NO");
        }
        }
    }
	}
}
