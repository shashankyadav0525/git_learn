/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class chack
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
		    int e = scan.nextInt();
		    int k = scan.nextInt();
		    int cnt = 0;
		    while(e > 0) {
		        e /= k;
		        cnt++;
		    }
		    System.out.println(cnt);
		}
	}
}
